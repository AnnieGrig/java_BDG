package lesson3;

import java.util.Scanner;

public class Lesson3Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= n) {
            System.out.print(i + " ");
            if (i % 2 != 0) {
                sum = sum + i;
                if (i != n) {
                    System.out.print("+ ");
                }
            } else {
                sum = sum - i;
                if (i != n) {
                    System.out.print("- ");
                }
            }

            i++;
        }
        System.out.println("\nresult = " + sum);
    }
}

