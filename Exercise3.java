import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter the text");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("The first letter of the string is " + str.charAt(0));
        input.close();


    }
}
