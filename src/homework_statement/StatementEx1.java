package homework_statement;

public class StatementEx1 {
    public static void main(String[] args) {
        String oddOrEven = returnOddOrEven(125);
        System.out.println(oddOrEven);
    }

    public static String returnOddOrEven(int number) {
        if (number % 2 == 0) {
            return (number + " number is even!!!");
        } else {
            return (number + " number is odd!!!");
        }
    }
}
