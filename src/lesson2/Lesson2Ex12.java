package lesson2;

import java.util.Scanner;

public class Lesson2Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        float x = sc.nextFloat();
        System.out.println("Please enter second number");
        float y = sc.nextFloat();
        System.out.println("Please enter the operator");

        Scanner symbolScaner = new Scanner(System.in);
        String a = symbolScaner.nextLine();
        char symbol = a.charAt(0);

        if (symbol == '*') {
            System.out.println(x * y);
        }   else if (symbol == '/' && y == 0) {
            System.out.println("Can't divide by zero");
        }   else if (symbol == '/') {
            System.out.println(x / y);
        }   else if (symbol == '-') {
            System.out.println(x - y);
        }   else if (symbol == '+') {
            System.out.println(x + y);
        }
    }
    }
