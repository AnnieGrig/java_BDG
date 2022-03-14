package lesson5;

public class Lesson5Ex5 {
    public static void main(String[] args) {
        char[] arr = {'A', 'N', 'N', 'I', 'E'};
        char searched = 'N';
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (searched == arr[i]) {
                sum++;
            }
        }
        System.out.println(searched + " occurs in array " + sum + " times");
    }
}
