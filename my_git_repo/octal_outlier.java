public class Main {
    public static void main(String[] args) {

int a[] = {1,2,053,4};
int b[][] = { {1,2,4} , {2,2,2} , {0,43,2}};
        System.out.println(a[3]==b[0][2]);
        System.out.println(a[2]==b[2][1]);
        
        //this print out true true because it reads 053 as octal number (base eight) whereas 43 //is base 10 (a normal decimal number)