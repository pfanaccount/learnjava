import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What will you buy? ");
        String product = scanner.nextLine();
        System.out.print("What is the price per item? $");
        double price = scanner.nextDouble();
        System.out.print("How many will you buy? ");
        int quantity = scanner.nextInt();

        double totalPrice = price * quantity;
        System.out.println("Your purchase of " + quantity + " " + product + "s will cost $" + totalPrice + ".");

    }
}