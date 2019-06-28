package com.ffn.services.employee.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ffn.services.employee.v1.api.Employee;
import com.ffn.services.employee.v1.exception.EmployeeIdMismatchException;
import com.ffn.services.employee.v1.exception.EmployeeNotFoundException;
import com.ffn.services.employee.v1.service.EmployeeServiceImpl;

import org.springframework.http.HttpStatus;

/**
 * 
 * Employee controller with all the rest endpoints supported
 *
 */
@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  @Qualifier("employeeService")
  private EmployeeServiceImpl employeeService;

  @GetMapping
  public List<Employee> findAll() {
    return employeeService.findAllEmployees();
  }

  // @GetMapping("/title/{bookTitle}")
  // public List findByTitle(@PathVariable String bookTitle) {
  // return employeeService.findByTitle(bookTitle);
  // }

  @GetMapping("/{id}")
  public Employee findOne(@PathVariable Long id) {
    
    Employee result = employeeService.getEmployeeById(id);
    
    if (result == null) {
      throw new EmployeeNotFoundException("Employee not found", null);
    }
    
    return result;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Employee create(@RequestBody Employee employee) {
    return employeeService.createEmployee(employee);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    
    Employee result = employeeService.getEmployeeById(id);
    
    if (result == null) {
      throw new EmployeeNotFoundException("Employee not found", null);
    }
    
    employeeService.deleteById(id);
    
  }

  @PutMapping("/{id}")
  public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
    
    if (employee.getEmpNo() != id) {
      throw new EmployeeIdMismatchException("Employee id is mismatch", null);
    }
    
    Employee result = employeeService.getEmployeeById(id);
    
    if (result == null) {
      throw new EmployeeNotFoundException("Employee not found", null);
    }
    
    return employeeService.createEmployee(employee);
  }

}
