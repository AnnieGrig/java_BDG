package homework_loop;

import java.util.Scanner;

public class LoopsEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input tne number:");
        int number = sc.nextInt();

        countSumOfFivesDivider(number);

    }

    public static void countSumOfFivesDivider(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.print("sum = " + sum);
    }
}