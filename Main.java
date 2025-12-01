public class Main {
   
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {
            System.out.println("You get a student discount of 10%");
            if(isSenior) {
                System.out.println("You get a senior discount of 20%");
                price *= 0.7;
            }
            else {
                System.out.println("You are not a senior.");
                price *= 0.9;
            }
        }
        else if (isSenior){
            System.out.println("You are not a student.");
            System.out.println("You get a senior discount of 20%");
            price *= 0.8;
        }
        else {
            System.out.println("You get no discount.");
        }

        System.out.printf("The price of your ticket is $%.2f\n", price);

        }

}