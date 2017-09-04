package uk.gov.ons.ctp.response.report.representation;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sourceforge.cobertura.CoverageIgnore;

import java.util.Date;
import java.util.UUID;

/**
 * Report External API representation.
 */
@CoverageIgnore
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class ReportDTO {

  private UUID id;

  private String reportType;

  private String contents;

  private Date createdDateTime;

}
