package com.example.employee.app.Exception;

////EmployeeNotFoundException is an exception used to indicate when an employee is looked up but not found
public class EmployeeNotFoundException  extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find employee with id "+id);
    }

}
