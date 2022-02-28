package lesson1;

import java.util.Scanner;

public class Lesson1Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 8;
        int y;
        System.out.println("Enter the number 8");
        x = sc.nextInt();
        for(y = 1; y <= 10; y++){
            System.out.println(x + "*" + y + "=" + (x * y));
        }
    }
}
