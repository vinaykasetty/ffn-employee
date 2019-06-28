package com.ffn.services.employee.v1.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.ffn.services.employee.v1.db.domain.Employee;
import com.ffn.services.employee.v1.db.repository.EmployeeRepository;

/**
 * 
 * Implementation of the DAO
 *
 */
@Component("employeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

  @Autowired
  private EmployeeRepository employeeRepository;

  
  /**
   * {@inheritDoc}
   */
  @Override
  public void createEmployee(Employee employee) {
    try {
      employeeRepository.save(employee);
    } catch (DataAccessException dao) {
      // TODO : log error and throw exception
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void updateEmployee(Employee employee) {
    try {
      employeeRepository.save(employee);
    } catch (DataAccessException dao) {
      // TODO : log error and throw exception
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void deleteEmployee(Long empId) {
    try {
      employeeRepository.deleteById(empId);
    } catch (DataAccessException dao) {
      // TODO : log error and throw exception
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public Employee getEmployeeById(Long empId) {

    Employee emp = null;
    try {
      Optional<Employee> result = employeeRepository.findById(empId);
      if (result.get() == null) {
        // TODO : log eerror and throw not found exception
      }
      emp = result.get();
    } catch (DataAccessException dao) {
      // TODO : log error and throw exception
    }

    return emp;
  }

  @Override
  public List<Employee> getAllEmployees() {
    List<Employee> listOfEmployees = null;
    try {
      Iterable<Employee> result = employeeRepository.findAll();

      if (result != null) {
        listOfEmployees = new ArrayList<>();
        for (Employee e : result) {
          listOfEmployees.add(e);
        }
      }

    } catch (DataAccessException dao) {
      // TODO : log error and throw exception
    }

    return listOfEmployees;
  }

}
