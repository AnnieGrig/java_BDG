package methods;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = sc.nextInt();
        System.out.println("Input second number: ");
        int second = sc.nextInt();
        System.out.println("Input third number: ");
        int third = sc.nextInt();

        int number = smallestNumber(first, second, third);
        System.out.println("The smallest number is " + number);
    }

    public static int smallestNumber(int n1, int n2, int n3) {

        if (n1 < n2 && n1 < n3) {
            return n1;
        } else if (n2 < n1 && n2 < n3) {
            return n2;
        } else {
            return n3;
        }
    }
}
