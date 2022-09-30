package lesson1;

import java.util.Scanner;

public class Lesson1Ex1 {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner s = new Scanner(System.in);
        String fraza = "Hello";
        String string = s.nextLine();
        System.out.println(fraza + " " + string);
    }
}
