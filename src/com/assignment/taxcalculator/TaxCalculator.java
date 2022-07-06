package com.assignment.taxcalculator;

import com.assignment.shared.models.SalaryGrades;

public class TaxCalculator {

    public static double calculateTax(SalaryGrades grade, double grossSalary){
        return switch (grade) {
            case one -> (grossSalary * 10) / 100;
            case two -> (grossSalary * 5) / 100;
            case three -> (grossSalary * 2.5) / 100;
            case four -> (grossSalary * 0.5) / 100;
            case five -> 0;
        };
    }
}
