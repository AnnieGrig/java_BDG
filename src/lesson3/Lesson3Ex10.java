package lesson3;

import java.util.Scanner;

public class Lesson3Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacchi's number:");
        int n = sc.nextInt();
        int x = 1;
        int y = 1;
        int sum = 0;
        System.out.print(x + " " + y + " ");
        for (int i = sum; i < n - 2; i++) {
            sum = x + y;
            System.out.print(sum + " ");
            x = y;
            y = sum;
        }



    }
}
