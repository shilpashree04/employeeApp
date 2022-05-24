package com.example.employee.app.Exception;

public class EmployeeExistedException extends RuntimeException{
    public EmployeeExistedException() {
        super("Employee already existed in database");
    }

}
