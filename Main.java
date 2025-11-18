import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principalInvestment;
        double interestRate;
        int compoundsPerYear;
        double years;

        System.out.print("Enter the principal investment: $");
        principalInvestment = scanner.nextDouble();
        System.out.print("Enter the interest rate (%): ");
        interestRate = (scanner.nextDouble() / 100.0);
        System.out.print("Enter the number of times compounded per year: ");
        compoundsPerYear = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        years = scanner.nextDouble();

        double finalInterest = (principalInvestment)* Math.pow(1 + (interestRate / compoundsPerYear), (compoundsPerYear * years));
        System.out.printf("Your final balance is $%.2f\n", finalInterest);

        scanner.close();
        }

}