package com.ffn.services.employee.v1.db.domain;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * Db domain class for Employee
 *
 */
@Table(name = "employee")
@Entity
public class Employee implements Serializable {
  
  private static final long serialVersionUID = 4844175606525201523L;

  @GeneratedValue
  @Id
  @Column(name = "emp_no")
  private Long empNo;
  
  @Column(name = "name")
  @NotNull
  private String empName;
  
  @Column(name = "title")
  private String title;
  
  @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = false, mappedBy = "depNo")
  private Department department;
  
  @Column(name = "created_at", insertable = false, updatable = false)
  private ZonedDateTime createdAt;
  
  @Column(name = "last_updated", insertable = false, updatable = false)
  private ZonedDateTime lastUpdated;
  
  @PrePersist
  protected void onCreate() {
    createdAt = ZonedDateTime.now();
  }
  
  @PreUpdate
  protected void onUpdate() {
    lastUpdated = ZonedDateTime.now();
  }

  // empty default constructor
  public Employee() {

  }

  public Long getEmpNo() {
    return empNo;
  }

  public void setEmpNo(Long empNo) {
    this.empNo = empNo;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

}
