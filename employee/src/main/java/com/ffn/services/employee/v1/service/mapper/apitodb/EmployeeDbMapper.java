package com.ffn.services.employee.v1.service.mapper.apitodb;

import com.ffn.services.employee.v1.db.domain.Employee;

/**
 * 
 * Api to db mapper for employee
 *
 */
public class EmployeeDbMapper {

  /**
   * maps from api to db
   * @param employee
   * @return
   */
  public Employee map(com.ffn.services.employee.v1.api.Employee employee) {
    
    Employee dbEmployee = new Employee();
    
    dbEmployee.setEmpName(employee.getEmpName());
    dbEmployee.setTitle(employee.getTitle());
    
    // TODO : department
    
    return dbEmployee;
  }

}
