package lesson2;

import java.util.Scanner;

public class Lesson2Ex6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input seconds: ");
    long seconds = sc.nextLong();
    long hours = seconds / 3600;
    long minutes = (seconds % 3600) / 60;
    long sec = (seconds - (hours * 3600) - (minutes * 60));
    System.out.println(hours + ":" + minutes + ":" + sec);

    }
}
