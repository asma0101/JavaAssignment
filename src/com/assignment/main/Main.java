package com.assignment.main;

import com.assignment.employeesalary.EmployeeSalary;
import com.assignment.shared.helpers.Helper;
import com.assignment.shared.models.SalaryGrades;
import com.assignment.salarycalculator.SalaryCalculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte employeeGrade = 0;
        double employeeWorkingDays = 1;
        String employeeDept;
        SalaryCalculator salaryCalculator = new SalaryCalculator();


        while(true){

            ///////////////// input employee grade ///////////////////////////
            do{
                try{
                    System.out.println("Enter employee grade (1-5):");
                    employeeGrade = scanner.nextByte();
                    if(employeeGrade < 1 || employeeGrade > 5){
                        System.out.println("Invalid Input. Re enter");
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid input. Re enter");
                }
                scanner.nextLine();

            }while(employeeGrade < 1 || employeeGrade > 5);


            ///////////////// input employee dept ///////////////////////////

            System.out.println("Enter employee department:");
            employeeDept = scanner.next();


            ///////////////// input working days ///////////////////////////

            do{
                try{
                    System.out.println("Enter No. of working days:");
                    employeeWorkingDays = scanner.nextDouble();
                    if(employeeWorkingDays <= 0 || employeeWorkingDays > Helper.getMonthDays()){
                        System.out.println("Invalid Input. Re enter");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Invalid Input. Re enter:");
                }
                scanner.nextLine();
            }while(employeeWorkingDays <= 0 || employeeWorkingDays > Helper.getMonthDays());

            ///////////////// calculate salary ///////////////////////////

            EmployeeSalary employeeSalary = salaryCalculator.calculateSalary(employeeWorkingDays, SalaryGrades.values()[employeeGrade-1]);
            employeeSalary.displaySalarySlip(employeeSalary, SalaryGrades.values()[employeeGrade-1],employeeDept, employeeWorkingDays);

            System.out.println("Salary Calculator has been called " + SalaryCalculator.getCounter() + " times.");
            System.out.println("Press 1 to continue, 0 to exit");
            byte terminator = scanner.nextByte();
            if(terminator == 0){
                break;
            }
        }

    }
}