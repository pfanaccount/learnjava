import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String restaurantType;
        String name;
        String adjective1;
        String verb1;
        String adjective2;

        System.out.print("Enter a restaurant name: ");
        restaurantType = scanner.nextLine();
        System.out.print("Enter a name: ");
        name = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective2 = scanner.nextLine();



        System.out.println("\nToday I went to a " +  restaurantType + " restaurant.");
        System.out.println("In the restaurant, I saw " + name + "." );
        System.out.println(name + " was " + adjective1 + " and " + verb1 + ".");
        System.out.println("I was " + adjective2 + "!");


        scanner.close();
    }
}