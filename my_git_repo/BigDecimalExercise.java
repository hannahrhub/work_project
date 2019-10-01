package com.practice;

import java.math.BigDecimal;

public class BigDecimalExercise {

    public static void main(String[] args) {
        BigDecimal total = BigDecimal.ZERO;
        //use BigDecimal with String constructor avoid double
        //.ZERO = shorthand for zero BigDecimal total = new BigDecimal("1.5");
        for (int i = 0; i < 100; i++) {
            total = total.add(new BigDecimal("0.1"));
            System.out.println("total = " + total);
        }
    }
}


