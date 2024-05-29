package org.example.n1exercici1_2;

public class EmployeeOnline extends Employee{

    private final double NET_TARIFF;

    public EmployeeOnline(String name, String lastName, double pricePerHour, double NET_TARIFF) {
        super(name, lastName, pricePerHour);
        this.NET_TARIFF = NET_TARIFF;
    }

    public double getNET_TARIFF() {
        return this.NET_TARIFF;
    }

    @Override
    public double calculateSalary(int hour){
        System.out.println("Ejercicio 1: calcular salario de trabajador remoto");
        return (super.getPricePerHour() * hour) + NET_TARIFF;
    }
}
