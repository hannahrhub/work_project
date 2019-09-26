package Email_App;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companyEmailEnd = "company.com";

    //constructor to receive first name last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Name: " + this.firstName + " " + this.lastName);

        //call a method ask for department - return department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyEmailEnd;
        System.out.println("Your email is: " + email);

    }

    //ask for department
    private String setDepartment() {
        System.out.println("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }


    //generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNPQRSTUWYZ0123456789!@£$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }


    //set mailbox capacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }


    //set alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    //change passsword
    public void changePassword(String password) {
        this.password = password;
    }

    //getters

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }

    public String showInfo() {
        return "Display name: " + firstName + " " + lastName +
                " Company name: " + email +
                " Mailbox Capacity: " + mailboxCapacity;
     }
}

