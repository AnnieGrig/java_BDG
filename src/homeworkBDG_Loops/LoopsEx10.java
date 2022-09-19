package homeworkBDG_Loops;

import java.util.Scanner;

public class LoopsEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input tne number:");
        int number = sc.nextInt();
        sumOfDigits(number);
    }

    public static void sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum = " + sum);
    }
}
