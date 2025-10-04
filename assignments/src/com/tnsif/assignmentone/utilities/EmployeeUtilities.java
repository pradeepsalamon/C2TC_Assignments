package com.tnsif.assignmentone.utilities;


import com.tnsif.assignmentone.employees.Employee;

public class EmployeeUtilities {
    public static void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        System.out.println("Updated Salary: " + newSalary);
    }

    public static void printEmployeeDetails(Employee employee) {
        employee.displayInfo();
    }
}
