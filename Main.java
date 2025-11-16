import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Did you shank someone in the leg at Panera bread? (true/false)");
        boolean didShank = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        if (didShank) {
            System.out.println("You are a wanted felon.");
        }
        else {
            System.out.println("You are not a wanted felon.");
        }

        scanner.close();
    }
}