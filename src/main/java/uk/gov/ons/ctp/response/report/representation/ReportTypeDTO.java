package uk.gov.ons.ctp.response.report.representation;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sourceforge.cobertura.CoverageIgnore;

/**
 * ReportType External API representation.
 */
@CoverageIgnore
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ReportTypeDTO {

  private String reportType;

  private Integer displayOrder;

  private String displayName;

}
