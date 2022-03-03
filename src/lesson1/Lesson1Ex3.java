package lesson1;

import java.util.Scanner;

public class Lesson1Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();
        System.out.println(x + "/" + y + "=" + (x / y));
    }
}
