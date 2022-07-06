package com.assignment.shared.models;

public enum SalaryGrades {
    one (1),
    two (2),
    three (3),
    four (4),
    five (5)
    ;

    SalaryGrades(int grade){
    }
    public static double getGradeSalary(SalaryGrades grade){
        return switch (grade) {
            case one -> (200000);
            case two -> (150000);
            case three -> (120000);
            case four -> (80000);
            case five -> (60000);
        };
    }

}
