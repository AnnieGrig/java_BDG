package lesson5;

public class Lesson5Ex7 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 8, -5, 258};
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

