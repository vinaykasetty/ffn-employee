package com.ffn.services.employee.v1.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.ffn.services.employee.v1.db.domain.Employee;

/**
 * 
 * JPA Repository interface binding contract with Employee entities
 *
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
