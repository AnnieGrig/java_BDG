package homeworkBDG_Loops;

import java.util.Scanner;

public class LoopsEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input tne number:");
        int number = sc.nextInt();
        productOfTwo_DigitNumbers(number);
    }
    public static void productOfTwo_DigitNumbers(int number) {
        long count = 1;
        for(int i = 10; i <= number; i++){
            if(i % 2 == 0) {
                count *= i;
            }
        }
        System.out.println("Count = " + count);
    }
}
