package lesson6;

import java.util.Scanner;

public class Lesson6Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input parenthesis: ");
        String parenthesis = sc.nextLine();

        char[] parArray = parenthesis.toCharArray();
        int counterOpen = 0;
        int counterClose = 0;
        boolean isEqual = false;

        for (int i = 0; i < parArray.length; i++) {
            if (parArray[i] == '(') {
                counterOpen++;
            } else if (parArray[i] == ')') {
                counterClose++;
            }
        }

        if ((parArray[0] == ')') ||
                (parArray[parArray.length - 1] == '(') ||
                (parArray.length % 2 != 0)) {
            isEqual = false;
        } else if (counterOpen == counterClose) {
            isEqual = true;
        }

        if (isEqual == true) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

