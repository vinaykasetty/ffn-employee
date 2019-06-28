package com.ffn.services.employee.v1.exception;

/**
 * 
 * Employee not found exception
 *
 */
public class EmployeeNotFoundException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 4147169994276536118L;


  public EmployeeNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
  // ...
}
