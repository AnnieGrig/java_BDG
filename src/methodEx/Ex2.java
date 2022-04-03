package methodEx;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = sc.nextInt();
        System.out.println("Input second number: ");
        int second = sc.nextInt();
        System.out.println("Input third number: ");
        int third = sc.nextInt();

        double average = averageOf3Numbers(first, second, third);
        System.out.println("Average of 3 numbers is:  " + average);
    }

    public static double averageOf3Numbers(int a, int b, int c) {
        return (a + b + c) / 3;
    }

}
