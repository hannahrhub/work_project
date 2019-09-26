package Project_Euler;
import java.math.BigInteger;
import java.util.Scanner;

// factor that is a prime number. In other words: any of the prime numbers that can be multiplied to give the original number
// Example: The prime factors of 15 are 3 and 5 (because 3×5=15, and 3 and 5 are prime
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?



public class Largest_Prime_Factor {
        public static void main(String[] args) {
            double out = 0;
            double num = 600851475143d;
            for (double n = 3; n < num; n += 2) {
                //iterates through a list of odd nu=[-0bers less than num
                while (num % n == 0) {
                    //System.out.println(n);
                    //check gives all prime factors of num
                    out = n;
                    //runs loop again
                    num = num / n;
                    //assigns num the division of that sum and then in print statement use ternary statement
                }
            }
            System.out.println("" + ((num == 1)?out:num));
            //will print out num (cos wouldn't be  == 1 after loops taken place)
            //num == 1 will evaluate to false or true part after : the value to evaluate if condition true
            //if condition num == 1 is false it will evaluate the value num so will print num
            //eg case.equals("uppercase") ? "JOHN" : "john"
            //System.out.println("" + num);
            //still shows same result?
        }
    }




