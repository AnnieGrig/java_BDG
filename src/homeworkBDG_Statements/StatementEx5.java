package homeworkBDG_Statements;

public class StatementEx5 {
    public static void main(String[] args) {
        boolean secondDigit = isDigitSeven(375);
        System.out.println(secondDigit);
    }

    public static boolean isDigitSeven(int number) {
        int x = number / 10;
        int digit = x % 10;
        if (digit == 7) {
            return true;
        }
        return false;
    }
}
