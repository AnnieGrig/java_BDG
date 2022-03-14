package lesson6;

import java.util.Scanner;

public class Lesson6Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first string: ");
        String str1 = sc.nextLine();
        System.out.println("Input second string: ");
        String str2 = sc.nextLine();
        boolean isEqual = false;

        if ((str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1)) {
            isEqual = true;
        }

        if (isEqual) {
            System.out.println(str1 + " is a rotation");
        } else {
            System.out.println(str1 + " is a not rotation");
        }
    }
}
