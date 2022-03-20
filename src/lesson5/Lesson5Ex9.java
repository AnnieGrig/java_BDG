package lesson5;

import java.util.Scanner;

public class Lesson5Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input arrays size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        System.out.println("Input first array's elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input array " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Input second array's elements: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print("Input array " + j + ": ");
            arr2[j] = sc.nextInt();
        }
        boolean isMeet = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    isMeet = true;
                    break;
                }
                isMeet = false;
            }
            if (isMeet == false) {
                System.out.println(arr[i] + " is not meet");
            }
        }
    }
}

