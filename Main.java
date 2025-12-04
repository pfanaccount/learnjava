import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 for lbs to kgs");
        System.out.println("Press 2 for kgs to lbs");

        int convInt = scanner.nextInt();

        System.out.println("Enter the weight: ");
        double weight = scanner.nextDouble();

        if (convInt == 1) {
            double newWeight = (weight / 2.205);
            System.out.printf("%f pounds = %.2f kilograms.", weight, newWeight);
        }
        else if (convInt == 2) {
            double newWeight = (weight * 2.205);
            System.out.printf("%f kilograms = %.2f pounds.", weight, newWeight);
        }
        else {
            System.out.println("Enter a valid conversion choice!");
        }

        scanner.close();
    }
}