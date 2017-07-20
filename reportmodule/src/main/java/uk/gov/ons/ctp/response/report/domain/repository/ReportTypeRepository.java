package uk.gov.ons.ctp.response.report.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.gov.ons.ctp.response.report.domain.model.ReportType;

import java.util.List;

/**
 * JPA Data Repository.
 */
@Repository
public interface ReportTypeRepository extends JpaRepository<ReportType, Integer> {
 
  /**
   * find reportTypes
   * @return reportType list or null if not found
   */
  List<ReportType> findReportTypeByOrderByDisplayOrder();
 
}
 