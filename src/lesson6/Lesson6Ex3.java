package lesson6;

import java.util.Scanner;

public class Lesson6Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder rev = sb.reverse();

        if (str.equals(rev.toString())) {
            System.out.println(str + " word is palindrome");
        } else {
            System.out.println(str + " word is not palindrome");
        }
    }
}