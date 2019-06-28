package com.ffn.services.employee.v1.api;

import java.io.Serializable;

/**
 * 
 * API domain class for Employee
 *
 */
public class Employee implements Serializable {

  private static final long serialVersionUID = -5263665389353587109L;

  private Long empNo;
  
  private String empName;
  
  private String title;
  
  private Department departmentInfo;

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

  public Department getDepartmentInfo() {
    return departmentInfo;
  }

  public void setDepartmentInfo(Department departmentInfo) {
    this.departmentInfo = departmentInfo;
  }

}
