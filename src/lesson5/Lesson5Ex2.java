package lesson5;

import java.util.Scanner;

public class Lesson5Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }
}
