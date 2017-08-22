package uk.gov.ons.ctp.response.report.domain.model;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Domain model report summary.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportSummary {

  private UUID id;

  private String reportTypeFK;

  private Date createdDateTime;

}
