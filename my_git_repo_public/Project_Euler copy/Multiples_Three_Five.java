package Project_Euler;
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

public class Multiples_Three_Five {

    public static void main(String[] args) {
        int sum = 0;
        boolean multipleThree = false, multipleFive = false;

        for(int i = 3; i < 1000; i++) {
          multipleThree = i % 3 == 0;
          multipleFive = i % 5 == 0;
          if (multipleThree || multipleFive) sum += i;
        }
        System.out.println(sum);


    }
}

//wanted to check if prints out multiples of 3 and five under 1000 - warning will have error
//if (i % 3 == 0 && i % 5 == 0) {
//System.out.println(i);