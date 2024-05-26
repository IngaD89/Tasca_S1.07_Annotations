package org.example.n1exercici1_2;

public class Employee {
    private String name;
    private String lastName;
    private double pricePerHour;

    public Employee(String name, String lastName, double pricePerHour) {
        this.name = name;
        this.lastName = lastName;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(int hour){
        return this.pricePerHour * hour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
