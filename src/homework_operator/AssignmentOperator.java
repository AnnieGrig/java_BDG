package homework_operator;

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = (int) 1.0;
        System.out.println("x = " + x);

        short y = (short) 1921222;
        System.out.println("y = " + y);

        System.out.print(2147483647 + 1);

        System.out.println("long y = " + "(x = 3)");

        boolean y3 = false;
        boolean x3 = (y3 = true);
        System.out.println(x3);

    }

}
