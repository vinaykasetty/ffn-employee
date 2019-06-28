package com.ffn.services.employee.v1.exception;

/**
 * 
 * Employee id mismatch exception
 *
 */
public class EmployeeIdMismatchException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 7031319802283474415L;

  public EmployeeIdMismatchException(String message, Throwable cause) {
    super(message, cause);
  }
  // ...
}
