package lesson6;

import java.util.Scanner;

public class Lesson6Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();

        int strLastIndex = str.length() - 1;
        boolean isPalidrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(strLastIndex)) {
                isPalidrome = false;
                break;
            }
            strLastIndex--;
        }
        if (isPalidrome) {
            System.out.println(str + " word is palidrome");
        } else {
            System.out.println(str + " word is not palidrome");
        }
    }
}

