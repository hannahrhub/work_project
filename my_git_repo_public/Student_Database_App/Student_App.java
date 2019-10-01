package Student_Database_App;
import java.util.Scanner;

public class Student_App {
    public static void main(String[] args) {
        //ask how many new students added
        System.out.println("Enter of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //create n number of new students
            for(int n = 0; n < numOfStudents; n++) {
                students[n] = new Student();
                students[n].enroll();
                students[n].payBalance();
            }

            for(int n = 0; n < numOfStudents; n++) {
                System.out.println(students[n].toString());
            }

    }
}
