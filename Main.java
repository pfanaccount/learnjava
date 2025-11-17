import java.util.Random;

public class Main {
   
    public static void main(String[] args) {

        Random random = new Random();

        boolean isHeads;


        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("It's heads!");
        }
        else {
            System.out.println("It's tails!");
        }



    }
}