package lesson3;

import java.util.Scanner;

public class Lesson3Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 9 == 0) {
                System.out.print( i + " ");
                sum += i;
            }
        }

        System.out.println("\nSum = " + sum);
    }
}
