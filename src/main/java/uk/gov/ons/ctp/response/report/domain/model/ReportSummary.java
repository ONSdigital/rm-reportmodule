package uk.gov.ons.ctp.response.report.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sourceforge.cobertura.CoverageIgnore;

import java.util.Date;
import java.util.UUID;

/**
 * Domain model report summary.
 */
@CoverageIgnore
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportSummary {

  private UUID id;

  private String reportTypeFK;

  private Date createdDateTime;

}
