package lesson2;

import java.util.Scanner;

public class Lesson2Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = sc.nextInt();
        System.out.println("Please enter second number");
        int b = sc.nextInt();
        System.out.println("Please enter third number");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println("The numbers are increasing");
        } else if (a > b && b > c) {
            System.out.println("The numbers are decreasing");
        } else {
            System.out.println("Neither invreasing or decreasing order ");
        }
    }
}
