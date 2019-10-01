package Student_Database_App;
import java.util.Scanner;


public class Student {
    private String student_firstName;
    private String student_lastName;
    private int student_year;
    private int student_balance = 0;
    private String courses = "";
    private String student_id_number;
    private static int id = 1000;
    private static int costOfCourse = 600;

    //constructor prompts user to enter students name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.student_firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.student_lastName = in.nextLine();

        System.out.print("1 - First year\n2 for Second year\n3 for Third year\nEnter student year: ");
        this.student_year = in.nextInt();
        setStudentID();
    }
    //generate unique 5 digit id number starting with grade
    private void setStudentID() {
        //year level plus static id
        id++;
        this.student_id_number = student_year + "" + id;
    }


    //can enroll in History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101
    public void enroll() {
        //get inside loop user hits zero when done enrolling
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                student_balance = student_balance + costOfCourse;
            }
            else { break; }
        } while (1 !=0);
    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: £" + student_balance);
    }
    // pay the balance
    public void payBalance() {
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        student_balance = student_balance - payment;
        System.out.println("Thank you for your payment of £" + payment);
        viewBalance();
    }

    //show info  (students name id courses enrolled and balance)
    public String toString() {
        return "Name: " + student_firstName + " " + student_lastName +
                "\nYear: " + student_year +
                "\nStudent ID: " + student_id_number +
                "\nCourses Enrolled: " + courses +
                "\nBalance: £" + student_balance;
    }
}
