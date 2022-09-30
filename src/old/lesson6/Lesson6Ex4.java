package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = sc.nextLine();
        System.out.println("Input level of rotation: ");
        int rotN = sc.nextInt();
        char x;

        char[] chars = word.toCharArray();

        for (int j = 0; j < rotN; j++) {

            for (int i = 0; i < chars.length - 1; i++) {
                x = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = x;
            }
        }
        String rotatedWord = String.valueOf(chars);
        System.out.println(rotatedWord);
    }
}

