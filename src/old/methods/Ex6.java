package methods;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer: ");
        int number = sc.nextInt();

        int result = sumOfDigits(number);
        System.out.println("Sum of digits is: " + result);
    }

    public static int sumOfDigits(int num) {
        int digit;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
