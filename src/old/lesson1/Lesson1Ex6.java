package lesson1;

import java.util.Scanner;

public class Lesson1Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 8;
        System.out.println("Enter the number 8");
        x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
    }
}
