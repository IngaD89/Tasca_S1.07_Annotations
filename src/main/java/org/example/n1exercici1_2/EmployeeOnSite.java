package org.example.n1exercici1_2;

import java.util.Date;

public class EmployeeOnSite extends Employee{

    private static double petrolPrice;

    public EmployeeOnSite(String name, String lastName, double pricePerHour, double petrolPrice) {
        super(name, lastName, pricePerHour);
        EmployeeOnSite.petrolPrice = petrolPrice;
    }

    @Override
    public double calculateSalary(int hour){
        return (super.getPricePerHour() * hour) + EmployeeOnSite.petrolPrice;
    }


    @Deprecated(since = "Java 7", forRemoval = true)
    public int deprecatedMethods(){
        int date = new Date().getDate();
        return date;
    }
}
