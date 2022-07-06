package com.assignment.shared.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Allowances {
    phone,
    travel,
    internet,
    other
    ;


    public static double getAllowanceAmount(Allowances allowances){
        return switch (allowances) {
            case phone -> 2000;
            case internet -> 4000;
            case travel -> 7000;
            case other -> 10000;
        };
    }

    public static double getGradeAllowance(SalaryGrades grade){

        double total = 0.0;
        List<Allowances> allowances = new ArrayList<>();
        if(grade == SalaryGrades.one){
            Collections.addAll(allowances, phone, travel, internet, other);
        }
        else if (grade == SalaryGrades.two){
            Collections.addAll(allowances, phone, travel, other);
        }
        else if(grade == SalaryGrades.three){
            Collections.addAll(allowances, phone, other);
        }
        else if(grade == SalaryGrades.four){
            allowances.add(other);
        }
        for(Allowances allowances1: allowances){
            total += getAllowanceAmount(allowances1);
        }
        return total;
    }
}
