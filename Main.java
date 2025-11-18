import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();


        double circleArea = Math.PI * Math.pow(radius, 2);
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); 
        System.out.printf("Circle Area: %.1f\n", circleArea);
        System.out.printf("Sphere Volume: %.1f\n", sphereVolume);
        scanner.close();
    }

}