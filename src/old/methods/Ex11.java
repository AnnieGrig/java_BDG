package methods;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters!" +
                "\n2. A password consists of only letters and digits!" +
                "\n3. A password must contain at least two digits!" +
                "\n Input a password: ");
        String password = sc.nextLine();

        boolean validOrNot = isValid(password);
        if (validOrNot)
            System.out.println("The password is valid " + password);
        else
            System.out.println("The password is not valid " + password);

    }

    public static boolean isValid(String password) {
        boolean isValid = true;

        if (password.length() < 8) {
            isValid = false;
            return isValid;
        } else {
            char digit = ' ';
            int numberCount = 0;
            char[] passwordCharArr = password.toCharArray();

            for (int i = 0; i < passwordCharArr.length; i++) {
                digit = passwordCharArr[i];
                if (digit >= '0' && digit <= '9') {
                    numberCount++;
                } else {
                    digit = Character.toUpperCase(digit);

                    if (!(digit >= 'A' && digit <= 'Z')) {
                        isValid = false;
                        return isValid;
                    }
                }
            }

            if (numberCount < 2) {
                isValid = false;
            }
            return isValid;
        }
    }
}

