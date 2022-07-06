package com.assignment.salarycalculator;


import com.assignment.employeesalary.EmployeeSalary;
import com.assignment.models.*;
import com.assignment.taxcalculator.TaxCalculator;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class SalaryCalculator {

    public static int counter = 0;

    public static int getCounter() {
        return counter;
    }


    public SalaryCalculator(){
        counter++;
    }

    public EmployeeSalary calculateSalary(double workingDays, SalaryGrades grade, String dept){
        double allowance = 0;
        double basicSalary = 0;
        double dailyRate = 0;
        double grossSalary = 0;
        double taxAmount = 0;

        allowance = Allowances.getGradeAllowance(grade);
        basicSalary = SalaryGrades.getGradeSalary(grade);
        dailyRate = basicSalary/getMonthDays();
        grossSalary = (dailyRate * workingDays) + allowance;
        taxAmount = TaxCalculator.calculateTax(grade, grossSalary);
        return new EmployeeSalary(grossSalary, basicSalary, taxAmount, dailyRate, allowance);
    }

    public int getMonthDays(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.lengthOfMonth();
    }
}
