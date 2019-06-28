package com.ffn.services.employee.v1.db.repository;

import org.springframework.data.repository.CrudRepository;

import com.ffn.services.employee.v1.db.domain.Department;

/**
 * 
 * JPA Repository interface binding contract with Department entities
 *
 */
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
