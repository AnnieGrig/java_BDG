package methodEx;

public class Ex16 {
    public static void main(String[] args) {
        twinPrimeNumbers();
    }

    public static void twinPrimeNumbers() {
        int number = 100;
        for (int i = 1; i < number - 2; i++) {
            if (isPrime(i) && isPrime((i + 2))) {
                System.out.println(i + "," + (i + 2));
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
