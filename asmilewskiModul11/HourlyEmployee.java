package com.milewskiarkadiuszmodul8.asmilewskiModul11;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    private double overtimeRate;

    public HourlyEmployee(String name, int birthYear, double baseSalary, int employeeId, int hoursWorked, double hourlyRate, double overtimeRate) {
        super(name, birthYear, baseSalary, 3 );
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.overtimeRate = overtimeRate;

    }

    public int addHoursWorked(int hours) { return hoursWorked; }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        if ( hoursWorked <= 160) {
            return super.getBaseSalary();
        } else {
            return (hoursWorked - 160) * overtimeRate + (160 * hourlyRate) + super.getBaseSalary();
        }
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                ", overtimeRate=" + overtimeRate +
                ", Final Salary= " + calculatePay()  +
                "} " + super.toString();
    }
}


