package com.practice;

import java.util.Comparator;

public class Lambda_Expression_2 {

    public static void main(String[] args) {
        Comparator<String> stringComparatorLambda2 =
                (s, t1) -> s.compareTo(t1);

        int lambdaComparsion = stringComparatorLambda2.compare("hello", "world");
        System.out.print(lambdaComparsion);
    }
}

//eg of simplified lambda expression

