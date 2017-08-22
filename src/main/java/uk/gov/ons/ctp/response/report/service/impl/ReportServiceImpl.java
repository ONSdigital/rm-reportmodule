package uk.gov.ons.ctp.response.report.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gov.ons.ctp.response.report.domain.model.Report;
import uk.gov.ons.ctp.response.report.domain.model.ReportSummary;
import uk.gov.ons.ctp.response.report.domain.model.ReportType;
import uk.gov.ons.ctp.response.report.domain.repository.ReportRepository;
import uk.gov.ons.ctp.response.report.domain.repository.ReportTypeRepository;
import uk.gov.ons.ctp.response.report.service.ReportService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Implementation of common report service interface.
 *
 */
@Slf4j
@Service
public class ReportServiceImpl implements ReportService {

  /**
   * Spring Data Repository for CSV Report entities.
   */
    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private ReportTypeRepository reportTypeRepository;

    @Override
    public List<ReportType> findTypes() {
      List<ReportType> reportTypes = reportTypeRepository.findReportTypeByOrderByDisplayOrder();
      return reportTypes;
    }

    @Override
    public Optional<ReportType> findType(String reportTypeId) {
      Optional<ReportType> reportType = reportTypeRepository.findFirstByReportTypePK(reportTypeId);
      return reportType;
    }

    @Override
    public List<ReportSummary> getReportSummary(final String reportType) {
      log.debug("Entering findReportSummariesByReportType with {}", reportType);
      return reportRepository.getReportSummary(reportType);
    }

    @Override
    public Optional<Report> findByReportId(final UUID reportId) {
      log.debug("Entering findByReportTypeAndReportDate with {}", reportId);
      return reportRepository.findById(reportId);
    }

}
