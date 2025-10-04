package com.tnsif.assignmentone;

import com.tnsif.assignmentone.employees.Manager;
import com.tnsif.assignmentone.employees.Developer;
import com.tnsif.assignmentone.utilities.EmployeeUtilities;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, "IT");
        Developer developer = new Developer("Bob", 102, 70000, "Java");

        System.out.println("=== Before Salary Update ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        System.out.println("\n=== After Salary Update ===");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
