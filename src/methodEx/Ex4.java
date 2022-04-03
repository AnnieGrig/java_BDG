package methodEx;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();

        int vowels = vowelsInAString(str);
        System.out.println("Vowels in the srting " + vowels);
    }

    public static int vowelsInAString(String str) {
        int counter = 0;
        char arr[] = new char[]{'a', 'o', 'i', 'u', 'e'};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (str.charAt(i) == arr[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
