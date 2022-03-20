package lesson5;

import java.util.Scanner;

public class Lesson5Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size:  ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input array " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are:");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
