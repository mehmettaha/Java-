import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int rawmin = scn.nextInt();
        int minutes = rawmin;
        int hours = minutes/60;
        minutes = minutes%60;
        int days = hours/24;
        hours = hours%24;
        int years = days/365;
        days = days%365;
        System.out.println(rawmin + " minutes makes " + minutes + " minutes, " + hours + " hours, " + days + " days and " + years + " years");
    scn.close();
    }
}