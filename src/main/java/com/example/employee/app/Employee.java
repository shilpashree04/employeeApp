package com.example.employee.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//is a JPA annotation to make this object ready for storage in a JPA-based data store 
@Entity
public class Employee {

	//id is marked w JPA annotations to indicate it's primary key and automatically populated by the JPA provider.
    @Id
    //*GeneratedValue* specifies the strategy that will be used for generating primary keys
    //*GenerationType.AUTO *default strategy used by spring boot
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name, designation;
    private int salary;

    protected Employee() {}

    public Employee(String name, String designation, int salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
