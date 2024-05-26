package org.example.n1exercici1_2;

public class Main {
    public static void main(String[] args) {
        Employee employeeOnline = new EmployeeOnline(
                "trabajador online",
                "last name",
                15,
                60
        );

        EmployeeOnSite employeeOnSite = new EmployeeOnSite(
                "trabajador presencial",
                "last name",
                20,
                60
        );

        System.out.println(employeeOnSite.calculateSalary(160));
        System.out.println(employeeOnline.calculateSalary(160));
        System.out.println(employeeOnSite.deprecatedMethods());
    }
}