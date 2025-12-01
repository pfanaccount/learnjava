public class Main {
   
    public static void main(String[] args) {

        String name = "pfanaccount";

        int length = name.length(); // 12
        char second = name.charAt(1); // f
        int index = name.indexOf("a"); // 2
        int lastIndex = name.lastIndexOf("a"); // 5

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = "     Pfan account";
        // name = name.trim(); // remove whitespace
        // name = name.replace("a", "o");

        // boolean isEmpty = name.isEmpty();

        if (name.equals("pfanaccount")) {
            System.out.println("hi");
        }
    }
}