package homeworkBDG_Statements;

public class StatementEx7 {
    public static void main(String[] args) {
        String maxNumber = maxNumber(15, 5, 45);
        System.out.println(maxNumber);
    }

    public static String maxNumber(int x, int y, int z) {
        if (x > y && x > z) {
            return (x + " is Max number!");
        } else if (y > x && y > z) {
            return (y + " is Max number!");
        } else {
            return (z + " is Max number!");
        }
    }
}
