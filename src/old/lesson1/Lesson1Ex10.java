package lesson1;

import java.util.Scanner;

public class Lesson1Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the widht of rectangle");
        int w = sc.nextInt();
        System.out.println("Enter the height rectangle");
        int h = sc.nextInt();
        int perimeter = 2 * (w + h);
        System.out.println("Perimeter is " + perimeter);
        int area = w * h;
        System.out.println("Area is " + area);
    }
}
