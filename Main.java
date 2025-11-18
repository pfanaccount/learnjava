import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double length;
        double height;

        System.out.print("Enter triangle height: ");
        height = scanner.nextDouble();
        System.out.print("Enter triangle length: ");
        length = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
        System.out.println(hypotenuse);
        scanner.close();
    }

}