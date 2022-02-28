package lesson3;

import java.util.Scanner;

public class Lesson3Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();
        boolean isblack = true;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (isblack) {
                    System.out.print("bleak");
                } else {
                    System.out.print("white");
                }

                if (j != num)
                    System.out.print("-");

                isblack = !isblack;
            }
            if (num % 2 == 0)
                isblack = !isblack;

            System.out.println();
        }
    }
}








