package lesson6;

import java.util.Scanner;

public class Lesson6Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String str = sc.nextLine();
        int wordsNum = 0;

        String[] divided = str.split(" ");

        System.out.println("The number of words is: " + divided.length);
    }
}