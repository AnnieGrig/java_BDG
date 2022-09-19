package homeworkBDG_Loops;

public class LoopsEx4 {
    public static void main(String[] args) {
        System.out.println(firstDigit(98562));
    }

    public static int firstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }
}
