package lesson3;

import java.util.Scanner;

public class Lesson3Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();

            if (num % 2 == 0 || num % 3 == 0)
                System.out.println("The number isn't prime");
            else {
                System.out.println("The number is prime" );
            }

    }
}