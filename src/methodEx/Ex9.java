package methodEx;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input start character: ");
        char start = sc.next().charAt(0);
        System.out.println("Input end character: ");
        char end = sc.next().charAt(0);
        System.out.println("Input line's number: ");
        int number = sc.nextInt();

        printChars(start, end, number);
    }

    public static void printChars(char x, char y, int number) {
        int counter = 1;
        for (char i = x; i <= y; i++) {
            System.out.print(i + " ");
            if (counter % number == 0) {
                System.out.println("\n");
            }
            counter++;
        }
    }
}
