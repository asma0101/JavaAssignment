package com.assignment.salarycalculator;


import com.assignment.employeesalary.EmployeeSalary;
import com.assignment.shared.helpers.Helper;
import com.assignment.shared.models.*;
import com.assignment.taxcalculator.TaxCalculator;



public class SalaryCalculator {

    public static int totalCount = 0;

    public static int getCounter() {
        return totalCount;
    }


    public SalaryCalculator(){
        totalCount++;
    }

    public EmployeeSalary calculateSalary(double workingDays, SalaryGrades grade){
        double allowance = 0;
        double basicSalary = 0;
        double dailyRate = 0;
        double grossSalary = 0;
        double taxAmount = 0;

        allowance = Allowances.getGradeAllowance(grade);
        basicSalary = SalaryGrades.getGradeSalary(grade);
        dailyRate = basicSalary/ Helper.getMonthDays();
        grossSalary = (dailyRate * workingDays) + allowance;
        taxAmount = TaxCalculator.calculateTax(grade, grossSalary);
        return new EmployeeSalary(grossSalary, basicSalary, taxAmount, dailyRate, allowance);
    }


}
