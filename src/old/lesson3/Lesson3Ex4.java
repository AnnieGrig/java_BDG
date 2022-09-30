package lesson3;

import java.util.Scanner;

public class Lesson3Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the power: ");
        int y = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= y; i++ ) {
            result *= x ;
        }
        System.out.println("Power = " + result );
    }
}