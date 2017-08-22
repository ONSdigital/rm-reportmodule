package uk.gov.ons.ctp.response.report.representation;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ReportType External API representation.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ReportTypeDTO {

  private String reportType;

  private Integer displayOrder;

  private String displayName;

}
