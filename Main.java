import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;

        System.out.print("Enter width (cm): ");
        width = scanner.nextDouble();
        System.out.print("Enter height (cm): ");
        height = scanner.nextDouble();

        System.out.println("The rectangles area is " + (width * height) + " cm squared.");


        scanner.close();
    }
}