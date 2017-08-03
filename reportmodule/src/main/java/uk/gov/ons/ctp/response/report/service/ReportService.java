package uk.gov.ons.ctp.response.report.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import uk.gov.ons.ctp.common.service.CTPService;
import uk.gov.ons.ctp.response.report.domain.model.Report;
import uk.gov.ons.ctp.response.report.domain.model.ReportSummary;
import uk.gov.ons.ctp.response.report.domain.model.ReportType;

/**
 * Simple common report module service interface for exposing MI reports.
 *
 */
public interface ReportService extends CTPService {

  /**
   * Find all available report types.
   *
   * @return List of report types or empty list.
   */
  List<ReportType> findTypes();

  /**
   * Find a report type by reportTypeID.
   *
   * @param reportTypeId String.
   * @return A container object which may contain a ReportType or null value.
   */
  Optional<ReportType> findType(String reportTypeId);

  /**
   * Find reports by reportType.
   *
   * @param reportType String.
   * @return List of report summaries or empty list.
   */
  List<ReportSummary> getReportSummary(String reportType);

  /**
   * Find Report entity by reportId.
   *
   * @param reportId UUID
   * @return A container object which may contain a Report or null value.
   */
  Optional<Report> findByReportId(UUID reportId);

}
