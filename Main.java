
public class Main {
   
    public static void main(String[] args) {

        String name = "pfanaccount";
        char firstLetter = 'p';
        int age = 19;
        double height = 193.1975;
        boolean isEmployed = false;
        double bankBalance = -10821.53;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your height is %.1f cm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("You are %d years old and %,.1f cm tall\n", age, height);
        System.out.printf("You have %,.2f dollars\n", bankBalance);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        }

}