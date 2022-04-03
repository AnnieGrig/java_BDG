package methodEx;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence: ");
        String str = sc.nextLine();

        int wordsCount = countWords(str);
        System.out.println("Words count is: " + wordsCount);
    }

    public static int countWords(String sentence) {
        String[] strArr = sentence.split(" ");
        return strArr.length;
    }
}
