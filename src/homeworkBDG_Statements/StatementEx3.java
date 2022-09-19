package homeworkBDG_Statements;

public class StatementEx3 {
    public static void main(String[] args) {
        String demandedInterval = returnInterval(18);
        System.out.println(demandedInterval);
    }

    public static String returnInterval(int number) {
        if (number > 5 && number < 8 || number > 15 && number < 20) {
            return (number + " number is between demanded interval!");
        } else {
            return (number + " number isn't between demanded interval!");
        }
    }
}
