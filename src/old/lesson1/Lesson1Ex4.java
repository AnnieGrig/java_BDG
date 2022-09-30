package lesson1;

public class Lesson1Ex4 {
    public static void main(String[] args) {
        // a. -5+8*6
        int x = -5;
        int y = 8;
        int z = 6;
        int result = (-5 + 8 * 6);
        System.out.println(result);

        // b. (55 + 9) % 9
        int xx = 55;
        int yy = 9;
        System.out.println((xx + yy) % yy);

        // c. 20 + - 3 * 5 / 8
        int b = -3;
        int c = 5;
        int d = 8;
        System.out.println((4*c) + b * c / d );


        // d. 5 + 15 / 3 * 2 - 8 % 3
        int e = 5;
        int f = 3;
        int g = 2;
        int h = 8;
        System.out.println(e + (e * f) / f * g - h % f);
    }
}
