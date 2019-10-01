package com.practice;
import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
//here we are writing an anonymous implementation of the interface Comparator which has methods on it to allow us to
//compare tow strings
public class Lamdba_Expression {

    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            //once wrote that line above intellij provided line/s below
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        };
        //essentially what doing is allowing something lk comparator to be treated as on object i.e:
        int comparsion = stringComparator.compare("hello", "world");
        System.out.println(comparsion);
        //prints out -15 why? cos compares them alphabetically


//same thing but with lambda expression

        Comparator<String> stringComparatorLambda =
                (String s, String t1) -> {
                    return s.compareTo(t1);
                };


        //within () parameters to the method that it is implementing then -> then {} contains the body of the function
        //the code executed when the lambda exp is called
        //in this eg only have a single method implemented when using a lambda expression in this case comapreTo()
        //(can contain multiple methods as long as one is abstract or unimplemented (so if an interface contains methods
        //that are default and static as long as there is an unimplemented (abstract) method in it as well

        //call the lamdba via its method variable reference so in this case stringComparatorLambda

        int lambdaComparsion = stringComparatorLambda.compare("hello", "world");
        System.out.print(lambdaComparsion);
        //returns same result

        //can simplify a lambda even more dont need to include <String cos java can tell from compareTo() seen below
        //in cases where lambda body has a single statement can also simplify dont need {} and return not needed as well


        Comparator<String> stringComparatorLambda2 =
                (s, t1) -> s.compareTo(t1);

    }

}
