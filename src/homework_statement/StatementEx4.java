package homework_statement;

public class StatementEx4 {
    public static void main(String[] args) {
        String dividerNumber = isDividerOrNot(30);
        System.out.println(dividerNumber);
    }

    public static String isDividerOrNot(int number) {
        if (number % 5 == 0 || number % 7 == 0) {
            return (number + " number is divider 5 or 7");
        } else {
            return (number + " number isn't divider 5 or 7");
        }
    }
}
