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
        System.out.println("Ejercicio 1: calcular salario de trabajador presencial");
        return (super.getPricePerHour() * hour) + EmployeeOnSite.petrolPrice;
    }


    @Deprecated(since = "Java 7", forRemoval = true)
    public int deprecatedMethods(){
        System.out.println("Ejercicio 2: Metodo obsoleto: date.getDate(). Obtiene el día actual del mes");
        int date = new Date().getDate();
        return date;
    }
}
