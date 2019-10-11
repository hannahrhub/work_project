package com.practice;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //System.out.println(i);
            for (int j = 0; j < 5 - i; j++) {
                //System.out.println(j);
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
                //System.out.println(k);
            }
            System.out.println();
        }

    }

}