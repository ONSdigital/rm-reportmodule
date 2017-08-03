package uk.gov.ons.ctp.response.report.endpoint;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import ma.glasnost.orika.MapperFacade;
import uk.gov.ons.ctp.common.endpoint.CTPEndpoint;
import uk.gov.ons.ctp.response.report.ReportBeanMapper;
import uk.gov.ons.ctp.response.report.domain.model.Report;
import uk.gov.ons.ctp.response.report.domain.model.ReportSummary;
import uk.gov.ons.ctp.response.report.domain.model.ReportType;
import uk.gov.ons.ctp.response.report.representation.ReportDTO;
import uk.gov.ons.ctp.response.report.representation.ReportSummaryDTO;
import uk.gov.ons.ctp.response.report.representation.ReportTypeDTO;
import uk.gov.ons.ctp.response.report.service.ReportService;

/**
 * The REST endpoint controller for CaseSvc Reports
 */
@RestController
@RequestMapping(value = "/reports", produces = "application/json")
@Slf4j
public final class ReportEndpoint implements CTPEndpoint {

  public static final String ERRORMSG_REPORTNOTFOUND = "Report not found for";
  public static final String ERRORMSG_REPORTSNOTFOUND = "Reports not found for";

  @Autowired
  private ReportService reportService;

  private MapperFacade mapperFacade = new ReportBeanMapper();

  /**
   * the GET endpoint to find all available report types
   *
   * @return List of report types
   */
  @RequestMapping(value = "/types", method = RequestMethod.GET)
  public ResponseEntity<List<ReportTypeDTO>> findReportTypes() {
    log.info("Finding Report Types");

    List<ReportType> reportTypes = reportService.findTypes();

    if (CollectionUtils.isEmpty(reportTypes)) {
      return ResponseEntity.noContent().build();
    } else {
      List<ReportTypeDTO> reportTypesList = mapperFacade.mapAsList(reportTypes, ReportTypeDTO.class);
      return ResponseEntity.ok(reportTypesList);
    }
  }

  /**
   * the GET endpoint to find list of report dates by reporttype
   *
   * @param reportType to find by
   * @return list of report dates by reportType
   */
  @RequestMapping(value = "/types/{reportType}", method = RequestMethod.GET)
  public ResponseEntity<List<ReportSummaryDTO>> findReportDatesByReportType(
      @PathVariable("reportType") final String reportType) {
    log.info("Entering findReportDatesByReportType with {}", reportType);

    Optional<ReportType> reportTypeExists = reportService.findType(reportType);
    if (!reportTypeExists.isPresent()) {
      return ResponseEntity.notFound().build();
    }

    List<ReportSummary> reports = reportService.getReportSummary(reportType);

    if (CollectionUtils.isEmpty(reports)) {
      return ResponseEntity.noContent().build();
    } else {
      List<ReportSummaryDTO> reportList = mapperFacade.mapAsList(reports, ReportSummaryDTO.class);
      return ResponseEntity.ok(reportList);
    }
  }

  /**
   * the GET endpoint to find report by reportId
   *
   * @param reportId to find by
   * @return the report found
   */
  @RequestMapping(value = "/{reportId}", method = RequestMethod.GET)
  public ResponseEntity<ReportDTO> findReportByReportId(@PathVariable("reportId") final UUID reportId) {
    log.info("Entering findReportByReportId with {}", reportId);

    Optional<Report> report = reportService.findByReportId(reportId);

    if (report.isPresent()) {
      ReportDTO reportDTO = mapperFacade.map(report.get(), ReportDTO.class);
      return ResponseEntity.ok(reportDTO);
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
