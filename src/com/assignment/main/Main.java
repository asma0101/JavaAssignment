package com.assignment.main;

import com.assignment.employeesalary.EmployeeSalary;
import com.assignment.models.SalaryGrades;
import com.assignment.salarycalculator.SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte employeeGrade;
        double employeeWorkingDays;
        SalaryCalculator salaryCalculator = new SalaryCalculator();


        do{
            System.out.println("Enter employee grade (1-5):");
            employeeGrade = scanner.nextByte();
            if(employeeGrade <1 || employeeGrade > 5){
                System.out.println("Invalid Input. Re enter:");
            }
        }while(employeeGrade <1 || employeeGrade > 5);

        System.out.println("Enter employee department:");
        String employeeDept = scanner.next();

        do{
            System.out.println("Enter No. of working days:");
            employeeWorkingDays = scanner.nextDouble();
            if(employeeWorkingDays <= 0 || employeeWorkingDays > salaryCalculator.getMonthDays()){
                System.out.println("Invalid Input. Re enter:");
            }
        }while(employeeWorkingDays <= 0 || employeeWorkingDays > salaryCalculator.getMonthDays());

        EmployeeSalary employeeSalary = salaryCalculator.calculateSalary(employeeWorkingDays, SalaryGrades.values()[employeeGrade-1], employeeDept);
        if(employeeSalary != null){
            System.out.println("Daily Rate: " + employeeSalary.getDailyRate());
            System.out.println("Basic Salary: " + employeeSalary.getBasicSalary());
            System.out.println("Allowances: " + employeeSalary.getTotalAllowance());
            System.out.println("---------------------- Working Days: " + employeeWorkingDays + "/" +salaryCalculator.getMonthDays() +"------------------------------");
            System.out.println("Gross Salary: " + employeeSalary.getGrossSalary());
            System.out.println("Tax deductions: " + employeeSalary.getTaxAmount());
            System.out.println("Net Pay: " + (employeeSalary.getGrossSalary() - employeeSalary.getTaxAmount()));
        }



    }
}