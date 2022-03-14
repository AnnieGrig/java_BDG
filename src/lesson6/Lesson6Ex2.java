package lesson6;

import java.util.Scanner;

public class Lesson6Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String str = sc.nextLine();
        int wordsNum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordsNum++;
            }
        }

        if (str.charAt(str.length() - 1) != ' ') {
            wordsNum++;
        }

        System.out.println("The number of words is: " + wordsNum);
    }
}

