package homeworkBDG_Operators;

public class AdditionalTasks {
    public static void main(String[] args) {
        float y = 2.1f;

        byte x = 5;
        byte y1 = 10;
        byte z = (byte) (x + y1);

        short x2 = 10;
        short y2 = 3;
        short z2 = (short) (x * y);

        long x3 = 10;
        int y3 = 5;
        y3 *= x3;

        int var1 = 10;
        int var2 = 5;

        int var3 = var1 + var2;
        var1 = var3 - var1;
        var2 = var3 - var1;

        int var4 = 10;
        int var5 = 5;

        var4 = var4 + var5;
        var5 = var4 - var5;
        var4 = var4 - var5;

        int first = 1;
        int last = 100;
        int sum = first + last;
        int count = 50 * sum;
        System.out.println("Count is " + count);

    }
}
