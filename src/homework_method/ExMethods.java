package homework_method;

public class ExMethods {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 4;
        int i = twoNumbers(n1, n2);

        String returnNull = noInputParameters();
//        System.out.println(returnNull);

        String hi = printHelloWorld(true, false);
        System.out.println(hi);

        char a = 'A';
        char b = 'L';
        char thisParameter = returnThisChar(a);
        char secondParameter = returnThisChar(b);
        System.out.println(thisParameter);

        float c = 5;
        float d = 6;
        float ff = returnOneOfThem(c, d);

    }

    public static int twoNumbers(int n1, int n2) {

        return 0;
    }

    public static String noInputParameters() {     // ???? return type/ String, ...?

        return null;
    }

    public static String printHelloWorld(boolean isTrue, boolean isFalse) {

        return "Hello world";
    }

    public static char returnThisChar(char a) {
        return a;
    }

    public static float returnOneOfThem(float c, float d) {
        return c;
    }

    public static void testRecursion() {

        testRecursion();
    }

}
