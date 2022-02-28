package lesson2;

import java.util.Scanner;

public class Lesson2Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter tne number");
        int a = sc.nextInt();
        if (a % 2 != 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
