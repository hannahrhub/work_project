package Email_App;

public class Email_app {

    public static void main(String[] args) {
    Email em1 = new Email("Bob", "Smith");

    em1.setAlternateEmail("bsmith@hotmail.com");
        System.out.println("Your alternate email is: " + em1.getAlternateEmail());

        System.out.println(em1.showInfo());
    }
}