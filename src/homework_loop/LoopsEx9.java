package homework_loop;

import java.util.Scanner;

public class LoopsEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input tne number:");
        int number = sc.nextInt();
        averageOfMaxAndMin(number);
    }

    public static void averageOfMaxAndMin(int number) {
        int max = number;
        int min = 1;
        int average = 0;
        average = (max + min) / 2;
        System.out.println("Average = " + average);
    }
}
