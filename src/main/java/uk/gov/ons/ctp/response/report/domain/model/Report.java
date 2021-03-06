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
import java.util.Date;
import java.util.UUID;

/**
 * Domain model object.
 */
@CoverageIgnore
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "report")
public class Report {

  @Id
  @Column(name = "reportpk")
  private Integer reportPK;

  private UUID id;

  @Column(name = "reporttypefk")
  private String reportTypeFK;

  private String contents;

  @Column(name = "createddatetime")
  private Date createdDateTime;

}
