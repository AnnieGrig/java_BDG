package lesson3;

import java.util.Scanner;

public class Lesson3Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int num = sc.nextInt();
        int sum = 1;

        for (int i = num; i > 0; i--) {
            sum *= i;
        }
            System.out.println(sum);

    }
}