package lesson5;

public class Lesson5Ex6 {
    public static void main(String[] args) {
        int[] arr = {8, 6, 9, 253, 28, -6, 65, 3};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min is: " + min + "\nMax is: " + max);
    }
}
