package lesson5;

public class Lesson5Ex10 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 5};
        int k = 5;
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                counter++;
            }
        }
        System.out.println(k + " occures in array " + counter + " time");
    }
}

