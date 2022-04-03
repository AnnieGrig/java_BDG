package methodEx;

public class Ex7 {
    public static void main(String[] args) {
        printPentagonalNumbers();
    }

    public static void printPentagonalNumbers() {
        int n = 50;
        int number = 1;
        int result = 0;
        while (number <= n) {
            result = (3 * (number * number) - number) / 2;
            System.out.println(result);
            number++;
        }
    }
}
