package methodEx;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();

        String midd = middleCharacter(str);
        System.out.println("The middle character in string is: " + midd);
    }

    public static String middleCharacter(String str) {
        int middle, middle1;

        if (str.length() % 2 == 0) {
            middle = str.length() / 2 - 1;
            return str.substring(middle, middle + 2);
        } else {
            middle = str.length() / 2;
            return str.substring(middle, middle + 1);
        }
    }
}
