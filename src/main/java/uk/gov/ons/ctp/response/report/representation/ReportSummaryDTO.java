package uk.gov.ons.ctp.response.report.representation;

import java.util.Date;
import java.util.UUID;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ReportSummary External API representation.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ReportSummaryDTO {

  private UUID id;

  private String reportType;

  private Date createdDateTime;

}
