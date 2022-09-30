package lesson7;

import java.util.Scanner;

public class Lesson7Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input nonnegative number: ");
            number = sc.nextInt();
        }
        while (number < 0);

        boolean trueOrFalse = returnTrueOrFalse(number);
        System.out.println(trueOrFalse);
    }

    public static boolean returnTrueOrFalse(int number) {
        int counter = 0;
        int digit;

        while (number > 0) {
            digit = number % 10;
            number = number / 10;
            if (digit == 0) {
                counter++;
            }
        }
        boolean isEven;
        if (counter % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }
}
