package org.example.n1exercici1_2;

public class EmployeeOnline extends Employee{

    private final double netTariff;

    public EmployeeOnline(String name, String lastName, double pricePerHour, double netTariff) {
        super(name, lastName, pricePerHour);
        this.netTariff = netTariff;
    }

    public double getNetTariff() {
        return this.netTariff;
    }

    @Override
    public double calculateSalary(int hour){
        return super.getPricePerHour() * hour;
    }
}
