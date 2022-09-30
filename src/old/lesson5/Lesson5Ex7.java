package lesson5;

import java.util.Scanner;

public class Lesson5Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Input array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input array " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int[] newArr = new int[arr.length];
        int x = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[x];
            x--;
        }
        System.out.print("Reversed elements are: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(newArr[j] + " ");
        }
    }
}
