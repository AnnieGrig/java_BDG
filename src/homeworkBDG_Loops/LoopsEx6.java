package homeworkBDG_Loops;

public class LoopsEx6 {
    public static void main(String[] args) {
        printSquare();
    }
    public static void printSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
