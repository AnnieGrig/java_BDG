package lesson5;

public class Lesson5Ex9 {
    public static void main(String[] args) {
        int[] arr = {9, 5, 8, 258, 24};
        int[] arr2 = {6, 9, 8, 5, 258};
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

