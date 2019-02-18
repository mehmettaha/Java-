import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int i = 6573;
        try {
            if (i > 9999) {
                scan.close();
                throw new ArithmeticException("The number is over 4 digits");     
            }       
        }
        finally {} 
        String str = String.valueOf(i);
        char[] digits = str.toCharArray();
        int result = 1;
        for (char x : digits) {
            int iTemp = Character.getNumericValue(x);
            result = result*iTemp;
        }
        System.out.println(result);
        scan.close();
    }
}