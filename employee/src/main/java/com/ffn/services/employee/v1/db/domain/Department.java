package com.ffn.services.employee.v1.db.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * Db domain class for Department
 *
 */
@Table(name = "department")
@Entity
public class Department implements Serializable {

  private static final long serialVersionUID = -5682297884424229504L;

  @GeneratedValue
  @Id
  @Column(name = "dep_no")
  private Long depNo;
  
  @Column(name = "name")
  @NotNull
  private String depName;
  
  @Column(name = "details")
  private String depDetails;  
  
  @Column(name = "created_at", insertable = false, updatable = false)
  private ZonedDateTime createdAt;
  
  @Column(name = "last_updated", insertable = false, updatable = false)
  private ZonedDateTime lastUpdated;
  
  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Employee employee;
  
  @PrePersist
  protected void onCreate() {
    createdAt = ZonedDateTime.now();
  }
  
  @PreUpdate
  protected void onUpdate() {
    lastUpdated = ZonedDateTime.now();
  }

  // empty default constructor
  public Department() {

  }

  public Long getDepNo() {
    return depNo;
  }

  public void setDepNo(Long depNo) {
    this.depNo = depNo;
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  public String getDepDetails() {
    return depDetails;
  }

  public void setDepDetails(String depDetails) {
    this.depDetails = depDetails;
  }
}
