package com.ffn.services.employee.v1.service;

import java.util.List;

import com.ffn.services.employee.v1.api.Employee;

/**
 * 
 * Service interface for employee
 *
 */
public interface EmployeeService {
  
  /**
   * Finds all the employees
   * @return
   */
  public List<Employee> findAllEmployees();

  /**
   * Gets the employee for the given emp id
   * @param id
   * @return
   */
  public Employee getEmployeeById(Long empId);

  /**
   * Creates a new employee
   * @param employee
   * @return
   */
  public Employee createEmployee(Employee employee);

  /**
   * Deletes the employee info for the given emp id
   * @param empId
   */
  public void deleteById(Long empId);

}
