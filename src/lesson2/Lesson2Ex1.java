package lesson2;

import java.util.Scanner;

public class Lesson2Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int a = sc.nextInt();
        System.out.println("Please enter second number");
        int b = sc.nextInt();
        System.out.println("Please enter third number");
        int c = sc.nextInt();
        System.out.println("Please enter fourth number");
        int d = sc.nextInt();
        if (a == b && a == c && a == d) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers aren't equal");
        }
    }
}
