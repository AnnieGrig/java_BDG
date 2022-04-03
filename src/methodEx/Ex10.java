package methodEx;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = sc.nextInt();

        if (year < 1752) {
            System.out.println("Input another year!!!");
        }
        boolean leapYear = isLeapYear(year);
        System.out.println("The year is leap: " + leapYear);
    }

    public static boolean isLeapYear(int number) {
        boolean isLeap = false;
        int x = 4;
        int start = 1752;
        if (number < start) {
            System.out.println("Input another year!!!");
        } else {
            while (start < number) {
                number -= x;
            }

            if (number == start) {
                isLeap = true;
            }
        }
        return isLeap;
    }
}
