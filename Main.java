import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 56) {
            System.out.println("Drink as much alcohol as you can. Seriously, it's good for you.");
        }
        else if (age > 56 ) {
            System.out.println("lmao unc");
        }
        else {
            System.out.println("ALCOHOL IS THE SERPENT'S BLOOD. AVOID AVOID AVOID.");

        }

        scanner.close();
    }
}