package uk.gov.ons.ctp.response.report.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Domain model object.
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reporttype")
public class ReportType {

  @Id
  @Column(name = "reporttypePK")
  private String reportTypePk;

  @Column(name = "displayorder")
  private Integer displayOrder;
  
  @Column(name = "displayname")
  private String displayName;
  
}
