package lesson2;

import java.util.Scanner;

public class Lesson2Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first age");
        short a = sc.nextShort();
        System.out.println("Please enter second age");
        short b = sc.nextShort();
        System.out.println("Please enter third age");
        short c = sc.nextShort();
        if (a > b && b > c) {
            System.out.println(a + " is the oldest and " + c + " is the youngest");
        } else if (b > a && a > c) {
            System.out.println(b + " is the oldest and " + c + " is the youngest");
        } else if (a > c && c > b) {
            System.out.println(a + " is the oldest and " + b + " is the youngest");
        } else if (b > c && c > a) {
            System.out.println(b + " is the oldest and " + a + " is the youngest");
        } else if (c > a && a > b) {
            System.out.println(c + " is the oldest and " + b + " is the youngest");
        } else if (c > b && b > a) {
            System.out.println(c + " is the oldest and " + a + " is the youngest");
        }
    }
}
