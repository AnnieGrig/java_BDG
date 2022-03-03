package lesson1;

import java.util.Scanner;

public class Lesson1Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x sum y = " + (x + y) + "\nx sub y = " + (x - y) +
                "\nx multyply y = " + (x * y) + "\nx divide y = " + (x / y) + "\nx rem y = " + (x % y));

    }
}
