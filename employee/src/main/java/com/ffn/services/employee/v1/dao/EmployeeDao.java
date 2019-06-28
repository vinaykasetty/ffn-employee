package com.ffn.services.employee.v1.dao;

import java.util.List;

import com.ffn.services.employee.v1.db.domain.Employee;

/**
 * 
 * Defines the contract for accessing Employee entities
 *
 */
public interface EmployeeDao {
  
  /**
   * Create employee
   * @param employee
   */
  void createEmployee(Employee employee);
  
  /**
   * Update employee info
   * @param employee
   */
  void updateEmployee(Employee employee);
  
  /**
   * Delete employee for given id
   * @param empId
   */
  void deleteEmployee(Long empId);
  
  /**
   * Get employee for given id
   * @param empId
   * @return
   */
  Employee getEmployeeById(Long empId);
  
  /**
   * Gets all employees
   * @return
   */
  List<Employee> getAllEmployees();

}
