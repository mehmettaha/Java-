import java.util.Scanner;

public class Opstrings {
    public static void main(String[] args) {
        System.out.println("Please enter 'Hello world'");
        String text_to_enter = "Hello world";
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (str.compareToIgnoreCase(text_to_enter) == 1) {
            System.out.println("You entered correctly");
        }
        else {
            text_to_enter = text_to_enter.concat(str);
            System.out.println("Concatenated two strings:" + text_to_enter);
        }
        str = input.next();
        System.out.println("Trying to find your input");
        if (text_to_enter.contains(str)) {
            System.out.println("It does contain");
            
        }
    }
}