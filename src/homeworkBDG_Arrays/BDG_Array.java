package homeworkBDG_Arrays;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BDG_Array<m> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a size: ");
        int size = sc.nextInt();
        System.out.print("Input an Array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printPositiveElements(arr);


        short[] arr2 = new short[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextShort();
        }
        printReverseOfArrayElements(arr2);


        long[] arr3 = new long[size];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextLong();
        }
        printMaxNumOfArrayElements(arr3);

        float[] arr4 = new float[size];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = sc.nextFloat();
        }
        printMinNumOfArrayElements(arr4);

        int[] arr5 = new int[size];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = sc.nextInt();
        }
        returnMovedElements(arr5);

        int[] array1 = new int[]{4, 8, 45, 789, 2};
        int[] array2 = new int[]{5, 5, 6, 2, 1};

        sumOfTwoArrayElements(array1, array2);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Input number K: ");
        int k = sc.nextInt();

        howManyTimesMeetK_InArrayElements(array, k);

    }

    /*
     *@param int[] n
     * print positive elements of array
     */
    public static void printPositiveElements(int[] n) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                System.out.println(n[i]);
            }
        }
    }

    /*
     *@param short[] n
     *print reverse of array elements
     */
    public static void printReverseOfArrayElements(short[] n) {
        for (int i = 0; i < n.length; i++) {
            int num = n[i], reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.println("Reverse elements are: " + reversed);
        }
    }

    /*
     *@long[] n
     * print max number of array
     */
    public static void printMaxNumOfArrayElements(long[] n) {
        long max = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.println("Max element is: " + max);
    }


    /*
     *@float[] n
     * print min number of array
     */
    public static void printMinNumOfArrayElements(float[] n) {
        float min = n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("Min element is: " + min);
    }


    /*
     *@param int[] n
     *return moved elements in int[] m
     */

    public static void returnMovedElements(int[] n) {
        int[] m = new int[n.length];
        int i;
        for (i = 0; i < m.length; i++) {
            m[i] = n[i];
        }
        System.out.println("Moved elements is: " + Arrays.toString(m));

    }


    /*
     *sum of two array's elements
     */

    public static void sumOfTwoArrayElements(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] + array2[i];
        }
        System.out.println("Sum of two array's elements is: " + Arrays.toString(array3));
    }

    /*
     *@param int[] array
     *how many times the number k meet in array elements
     */

    public static void howManyTimesMeetK_InArrayElements(int[] array, int k) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                counter++;
            }
        }
        System.out.println(k + " occures in array " + counter + " time");
    }
}