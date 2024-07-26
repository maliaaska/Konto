package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class Employee extends Person {
    private double baseSalary;
    private long employeeId;

    private static long nextEmployeeId = 1;
    public Employee(String name, int birthYear, double baseSalary, long employeeId) {
        super(name, birthYear);
        this.baseSalary = baseSalary;
        this.employeeId = nextEmployeeId;
        ++nextEmployeeId;
    }

    public Employee(String name, int birthYear, Object o) {
        super(name, birthYear);
    }

    public double calculatePay() {
        return baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "baseSalary=" + baseSalary +
                ", employeeId=" + employeeId +
                "} " + super.toString();
    }
}
