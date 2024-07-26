package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class SalariedEmployee extends Employee {
    private double bonus;

    public SalariedEmployee(String name, int birthYear, double baseSalary, long employeeId, double bonus) {
        super(name, birthYear, baseSalary, employeeId);
        this.bonus = bonus;

    }

    public double addBonus( double bonus) {
        return this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculatePay() {
        return super.getBaseSalary() + addBonus(bonus);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "bonus=" + bonus  +
                " baseSalary= " + super.getBaseSalary() +
                " finalPayment= " + calculatePay() +
                "} " + super.toString();
    }
}

