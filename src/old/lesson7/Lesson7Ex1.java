package lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson7Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input non negative number: ");
            number = sc.nextInt();
        }
        while (number < 0);

        int sumResult = returnSumOfDigits(number);
        System.out.println(sumResult);
    }

    public static int returnSumOfDigits(int number) {

        int digit, sum = 0;

        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void returnSumOfDigitMath(int number, String name, double x, int y) {
    }
}
