package homeworkBDG_Statements;

import java.util.Scanner;

public class StatementEX8 {
    public static void main(String[] args) {
        isLeapYear(2020);
    }

    public static void isLeapYear(int year) {
        boolean is_leap_year = false;
        if (year % 4 == 0) {
            is_leap_year = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        } else
            is_leap_year = false;
        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
}
