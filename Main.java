import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;

        System.out.print("Enter your email address: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);
            System.out.println(username);
            System.out.println(domain);
        }
        else {
            System.out.println("You did not enter a valid email!");
        }



        scanner.close();
    }
}