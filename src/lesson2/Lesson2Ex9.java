package lesson2;

import java.util.Scanner;

public class Lesson2Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int x = sc.nextInt();
        System.out.println("Please enter second number");
        int y = sc.nextInt();
        if (x < 0 && y < 0) {
            System.out.println("The numbers have the same sign");
        } else if (x > 0 && y > 0) {
            System.out.println("The numbers have the same sign");
        } else {
            System.out.println("The numbers have different sign");
        }
    }
}
