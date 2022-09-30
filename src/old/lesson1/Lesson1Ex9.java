package lesson1;

import java.util.Scanner;

public class Lesson1Ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double first, second, third;
        first = s.nextDouble();
        second = s.nextDouble();
        third = s.nextDouble();
        double average = (first + second + third) / 3;
        System.out.println("Average is: " + average);
    }
}
