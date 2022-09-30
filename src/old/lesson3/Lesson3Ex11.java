package lesson3;

import java.util.Scanner;

public class Lesson3Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        int divider = 2;
        while (divider < num) {
            if (num % divider == 0) {
                isPrime = false;
                break;
            }
            divider++;
        }

        if (isPrime) {
            System.out.println(num + " " + "is prime");
        } else {
            System.out.println(num + " " + "is not prime");
        }

    }
}