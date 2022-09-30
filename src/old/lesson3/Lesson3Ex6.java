package lesson3;

import java.util.Scanner;

public class Lesson3Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        int number = 1;
        float result = 0;

        for (float i = 1; i <= n; i++) {
            result = result + number/i;
        }
        System.out.println("Sum = " + result);
    }
}

