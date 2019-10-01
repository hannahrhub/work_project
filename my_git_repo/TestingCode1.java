package com.practice;

public class TestingCode1 {
    int i;
    static int j;


        public static void main(String[] args) {


            TestingCode1 c1 = new TestingCode1();
            c1.add1();
            c1.add1();
            TestingCode1 c2 = new TestingCode1();
            c2.add1();
            System.out.println(c1.i + " " + c1.j + " " + c2.i + " " + c2.j);
        }
    


        public void add1() {
            i++;
            j++;
        }
    }







