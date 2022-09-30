package lesson7;

import java.util.Scanner;

public class Lesson7Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();
        System.out.println("Input percentage:");
        int percentage = sc.nextInt();
        float result = returnPersentage(number, percentage);
        System.out.println("Percentege of number = " + result + "%");
    }

    public static float returnPersentage(int number, int percentage) {
        float result = 0;
        result = (((number * percentage) / 100) - number);
        return result;
    }
}

