package lesson6;

import java.util.Scanner;

public class Lesson6Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        System.out.println("Input an index: ");
        int k = sc.nextInt();
        if (k >= str.length()) {
            System.out.println(k + " index is out of bounds");
        } else {
            char searched = str.charAt(k);
            System.out.println("Character at index " + k + " is " + "'" + searched + "'");
        }

    }
}
