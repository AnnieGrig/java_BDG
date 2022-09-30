package homework_operator;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 8;
        int b = 6;
        System.out.println("a + b = " + (a + b) + "\na *  b = " + (a * b) + "\na / b = " + (a / b) +
                "\na - b = " + (a - b) + "\na % b = " + (a % b));

        double c = 6.4;
        double d = 0.03;
        System.out.println("c + d = " + (c + d) + "\nc *  d = " + (c * d) + "\nc / d = " + (c / d) +
                "\nc - d = " + (c - d) + "\nc % d = " + (c % d));

        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("x = " + x + "\ny = " + y);

        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println("-e = " + (-e));
        System.out.println("-f = " + (-f));
        System.out.println("+e = " + (+e));
        System.out.println("-e + 92 = " + (-e + 92));
        System.out.println("!true is " + !n1);
        System.out.println("!(!true) is " + !(!n1) );
        System.out.println("e++ = " + (e++));
        System.out.println("--f = " + (--f));

        int x1 = 3;
        int y1 = (++x1) * 5 / (x1--) + (--x1);
        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
}
