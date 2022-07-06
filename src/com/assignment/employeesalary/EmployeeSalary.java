package com.assignment.employeesalary;

public class EmployeeSalary {

    private final double grossSalary;
    private final double basicSalary;
    private final double taxAmount;
    private final double dailyRate;
    private final double totalAllowance;

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getTotalAllowance() {
        return totalAllowance;
    }

    public EmployeeSalary(double grossSalary, double basicSalary, double taxAmount, double dailyRate, double totalAllowance) {
        this.grossSalary = grossSalary;
        this.basicSalary = basicSalary;
        this.taxAmount = taxAmount;
        this.dailyRate = dailyRate;
        this.totalAllowance = totalAllowance;
    }
}
