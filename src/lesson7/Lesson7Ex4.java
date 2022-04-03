package lesson7;

import java.util.Scanner;

public class Lesson7Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = sc.nextLine();

        String reverse = printReverse(new StringBuilder(str));
        System.out.println("Reverse of the string is " + reverse );
    }
    public static String printReverse(StringBuilder source) {
        source.reverse();
        return source.toString();
    }
}
