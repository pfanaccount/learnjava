import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();


        double circleArea = Math.PI * Math.pow(radius, 2);
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); 
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Sphere Volume: " + sphereVolume);
        scanner.close();
    }

}