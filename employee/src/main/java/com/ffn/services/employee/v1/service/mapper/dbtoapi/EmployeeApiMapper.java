package com.ffn.services.employee.v1.service.mapper.dbtoapi;

import java.util.ArrayList;
import java.util.List;

import com.ffn.services.employee.v1.api.Employee;

/**
 * 
 * Db to api mapper for employee
 *
 */
public class EmployeeApiMapper {

  public Employee map(com.ffn.services.employee.v1.db.domain.Employee dbEmployee) {
    
    Employee apiEmployee = new Employee();
    
    if (dbEmployee != null) {
      apiEmployee = new Employee();
      
      apiEmployee.setEmpNo(dbEmployee.getEmpNo());
      apiEmployee.setEmpName(dbEmployee.getEmpName());
      apiEmployee.setTitle(dbEmployee.getTitle());
      
      // TODO : mapper for department

    }
    
    return apiEmployee;
  }

  public List<Employee> map(List<com.ffn.services.employee.v1.db.domain.Employee> dbResult) {
    
    List<Employee> allApiEmployees = null;
    
    
    if (dbResult != null) {
      allApiEmployees = new ArrayList<>();
      for (com.ffn.services.employee.v1.db.domain.Employee dbE : dbResult) {
        Employee apiEmployee = map(dbE);
        allApiEmployees.add(apiEmployee);
      }
    }
    
    
    return allApiEmployees;
  }

}
