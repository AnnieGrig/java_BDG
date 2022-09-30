package lesson2;

import java.util.Scanner;

public class Lesson2Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        double a = sc.nextDouble();
        System.out.println("Please enter second number");
        double b = sc.nextDouble();
        if (a >= 0 && a <= 1 && b >= 0 && b <= 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
