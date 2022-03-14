package lesson5;

public class Lesson5Ex4 {
    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 6, 18, 0};
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        System.out.println("New Array elements are: ");
        for (int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j] + " ");
        }
    }
}
