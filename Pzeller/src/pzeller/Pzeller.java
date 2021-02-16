/*
Marc Bosch Castaño
GitHub
 */
package pzeller;

import java.util.Scanner;

public class Pzeller {

    private static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        int day = 12, month = 9, year;
        System.out.print("Give a year: ");
        year = keyboard.nextInt();
        String dayString = functionBirthDay(day, month, year);
        System.out.println("That day is: " + dayString);
        System.out.println("******** Marc Bosch Castaño **********");
    }

    /*private static int functionB(int year) {       
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) return 1;
        return 0;        
    }*/

    private static String functionBirthDay(int day, int month, int year) {
        //Zeller
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            String dayString;
            String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int a, y, m, d;
            a = (14 - month) / 12;
            y = year - a;
            m = month + 12 * a - 2;
            d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            dayString = week[d];
            System.out.println("The international programmer day is: " + day);
            return dayString;
        } else {
            String dayString;
            String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int a, y, m, d;
            a = (14 - month) / 12;
            y = year - a;
            m = month + 12 * a - 2;
            d = (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            dayString = week[d + 1];
            System.out.println("The international programmer day is: " + (day + 1));
            return dayString;
        }

    }
}
