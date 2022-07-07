package com.assignment.employeesalary;

import com.assignment.shared.helpers.Helper;
import com.assignment.shared.models.SalaryGrades;

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


    public void displaySalarySlip(EmployeeSalary employeeSalary, SalaryGrades grade, String dept, double workingDays){
        System.out.println("Grade: " + grade.name());
        System.out.println("Department: " + dept);
        System.out.println("Daily Rate: " + String.format("%.3f", employeeSalary.getDailyRate()));
        System.out.println("Basic Salary: " + String.format("%.3f", employeeSalary.getBasicSalary()));
        System.out.println("Allowances: " + String.format("%.3f", employeeSalary.getTotalAllowance()));
        System.out.println("Working Days : " + workingDays + "/" + Helper.getMonthDays());
        System.out.println("Gross Salary: " + String.format("%.3f",employeeSalary.getGrossSalary()));
        System.out.println("Tax Deductions: " + String.format("%.3f", employeeSalary.getTaxAmount()));
        System.out.println("Net Pay: " + String.format("%.3f", employeeSalary.getGrossSalary() - employeeSalary.getTaxAmount()));

    }

}
