public class Main {
    public static void main(String[] args) {

                int kVal = 5;
                int factorial = 1;
                while (kVal > 1) {
                    factorial *= kVal;
                    kVal -= 1;
                    //think factorial = factorial * kVal
                    //factorial is equals to itself times kVal
                    //first time do loop its 5, 20 (5X4), 60 (20X3)
                    //prints out what factorial would be when kVal down to 1

                }
                System.out.println(factorial);
                //prints out 120

                int iVal = 5;
                do {
                    System.out.print(iVal);
                    System.out.print(" * 2 = ");
                    iVal *= 2;
                    System.out.println(iVal);
                } while (iVal < 100);
            //checks condition at end of loop
            //body executes at least once
            //use print value not on a new line

            }

        }