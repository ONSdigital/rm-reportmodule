package uk.gov.ons.ctp.response.report.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sourceforge.cobertura.CoverageIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Domain model for type of report.
 */
@CoverageIgnore
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reporttype")
public class ReportType {

  @Id
  @Column(name = "reporttypepk")
  private String reportTypePK;

  @Column(name = "displayorder")
  private Integer displayOrder;

  @Column(name = "displayname")
  private String displayName;

}
