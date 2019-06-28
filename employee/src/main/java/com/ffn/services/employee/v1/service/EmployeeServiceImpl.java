package com.ffn.services.employee.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ffn.services.employee.v1.api.Employee;
import com.ffn.services.employee.v1.dao.EmployeeDao;
import com.ffn.services.employee.v1.service.mapper.apitodb.EmployeeDbMapper;
import com.ffn.services.employee.v1.service.mapper.dbtoapi.EmployeeApiMapper;

/**
 * 
 * Service implementation for employee 
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
  
  @Autowired
  @Qualifier("employeeDaoImpl")
  private EmployeeDao employeeDao;
  
  @Autowired
  @Qualifier("employeeDbMapper")
  private EmployeeDbMapper employeeApiToDbMapper;
  
  @Autowired
  @Qualifier("employeeApiMapper")
  private EmployeeApiMapper employeeDbToApiMapper;


  /**
   * {@inheritDoc}
   */
  @Override
  public List<Employee> findAllEmployees() {
    
    List<com.ffn.services.employee.v1.db.domain.Employee> dbResult = employeeDao.getAllEmployees();
    
    List<Employee> allEmployees = employeeDbToApiMapper.map(dbResult);
    
    return allEmployees;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Employee getEmployeeById(Long empId) {
    
    if (empId == null) {
      // TODO : log and throw validation exception
    }
    
    com.ffn.services.employee.v1.db.domain.Employee dbResult = employeeDao.getEmployeeById(empId);
    Employee apiEmployee = employeeDbToApiMapper.map(dbResult);
    
    return apiEmployee;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Employee createEmployee(Employee employee) {
    
    // TODO : validate the employee payload, for mandatory fields check
    // throw validation exception if validation fails
    
    com.ffn.services.employee.v1.db.domain.Employee dbEmployee = employeeApiToDbMapper.map(employee); 
    
    employeeDao.createEmployee(dbEmployee);
    
    return employee;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void deleteById(Long empId) {
    
    if (empId == null) {
      // TODO : log and throw validation exception
    }
    
    employeeDao.deleteEmployee(empId);
    
  }

}
