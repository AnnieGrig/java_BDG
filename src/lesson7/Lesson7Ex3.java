package lesson7;

import java.util.Scanner;

public class Lesson7Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = sc.nextInt();
        System.out.println("Input array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input array " + i + ":");
            arr[i] = sc.nextInt();
        }

        int index = findFirst(number, arr);
        System.out.println("The Number occurs in the array first time at index " + index);
    }

    public static int findFirst(int number, int[] array) {

        for (int j = 0; j < array.length; j++) {
            if (number != array[j]) {
                continue;
            } else {
                return j;
            }
        }

        return -1;
    }
}
