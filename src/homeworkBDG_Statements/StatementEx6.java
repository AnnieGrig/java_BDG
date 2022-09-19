package homeworkBDG_Statements;

public class StatementEx6 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int circleX = 0;
        int circleY = 5;
        int rad = 10;

        if (isInside(0, 5, 1, 1, 10)) {
            System.out.println("Inside");
        } else {
            System.out.println("OutSide");
        }

    }

    public static boolean isInside(int circleX, int circleY, int x, int y, int rad) {
        if ((x - circleX) * (x - circleX) + (y - circleY) * (y - circleY) <= rad * rad) {
            return true;
        } else {
            return false;
        }
    }
}
