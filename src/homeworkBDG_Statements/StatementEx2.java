package homeworkBDG_Statements;

public class StatementEx2 {
    public static void main(String[] args) {
        String positiveOrNegative = returnPositiveOrNegative(-125);
        System.out.println(positiveOrNegative);
    }

    public static String returnPositiveOrNegative(int number) {
        if (number > 0) {
            return (number + " number is positive!!!");
        } else {
            return (number + " number is negative!!!");
        }
    }
}
