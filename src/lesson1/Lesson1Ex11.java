package lesson1;

import java.util.Scanner;

public class Lesson1Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        int z = x + y;
        x = z - x;
        y = z - y;
        System.out.println(x + " " + y);


    }
}
