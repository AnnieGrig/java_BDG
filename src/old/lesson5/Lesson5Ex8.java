package lesson5;

public class Lesson5Ex8 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 8, -5, 258};
        int x = 0;
        int revNum = 0;

        System.out.println("Reversed elements are: ");
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            revNum = arr[x];
            arr[x] = arr[i];
            arr[i] = revNum;
            x++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

