package com.ffn.services.employee.v1.api;

import java.io.Serializable;

/**
 * 
 * API domain class for Department
 *
 */
public class Department implements Serializable {

  private static final long serialVersionUID = -7532138354369794974L;

  private Long depNo;
  
  private String depName;
  
  private String depDetails;

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
