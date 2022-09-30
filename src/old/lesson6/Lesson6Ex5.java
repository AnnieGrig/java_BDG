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

        String str3 = str1 + str1;
        if (str3.contains(str2))
            isEqual = true;
        else
            isEqual = false;

        if (isEqual) {
            System.out.println(str1 + " is a rotation");
        } else {
            System.out.println(str1 + " is a not rotation");
        }
    }
}

