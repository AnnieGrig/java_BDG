package methods;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of sides a pentagon");
        int numberSides = sc.nextInt();
        System.out.println("Input the side");
        int side = sc.nextInt();

        double area = areaOfPentagon(side);
        System.out.println("The area of a pentagon = " + area);
    }

    public static double areaOfPentagon(int side) {
        double x = 1.72048;

        double area = x * (side * side);
        return area;
    }
}
