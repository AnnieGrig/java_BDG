package lesson1;

import java.util.Scanner;

public class Lesson1Ex8 {
    public static void main(String[] args) {
        System.out.println("Enter the radius:");
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        final double pi = Math.PI;
        double resultperimeter = 2 * pi * radius;
        System.out.println("Perimeter is = " + resultperimeter);
        double resultArea = pi * (radius * radius);
        System.out.println("Area is = " + resultArea);


    }
}
