package homework_operator;

public class ShiftOperators {
    public static void main(String[] args) {
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        int resultForEight = multiply(5, 8);
        int resultForSixteen = multiply(5, 16);

    }

    static int multiply(int n, int m) {
        int ans = 0, count = 0;  // code-y copy em arel geeksforgeeks-ic, bayc debug em arel, haskacel )))
        while (m > 0) {
            if (m % 2 == 1)
                ans += n << count;
            count++;
            m /= 2;
        }
        return ans;
    }
}
