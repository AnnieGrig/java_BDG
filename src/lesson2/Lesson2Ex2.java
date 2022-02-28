package lesson2;

import java.util.Scanner;

public class Lesson2Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter tne number");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("The number is negative");
        } else if(a == 0){
            System.out.println("0 is not positive not negative!!!");
        } else {
            System.out.println("The number is positive");
        }
    }
}
