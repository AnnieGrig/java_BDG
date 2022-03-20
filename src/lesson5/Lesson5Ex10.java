package lesson5;

import java.util.Scanner;

public class Lesson5Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Input array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input array" + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input a number: ");
        int k = sc.nextInt();
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                counter++;
            }
        }
        System.out.println(k + " occures in array " + counter + " time");
    }
}

