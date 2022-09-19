package homeworkBDG_Loops;

public class LoopsEx1 {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
            if (x == 8){
                break;
            }
        }
        System.out.println(x);
    }
}
