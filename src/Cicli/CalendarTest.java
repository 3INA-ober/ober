package Cicli;

import java.util.Scanner;

public class CalendarTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day, month, year;

        System.out.println("insert the day");
        day = in.nextInt();

        System.out.println("insert the month");
        month = in.nextInt();

        System.out.println("insert the year");
        year = in.nextInt();

        System.out.println("The day you asked is: " +Calendar.Zellercongruence(day, month, year));
        
    }
    
}
