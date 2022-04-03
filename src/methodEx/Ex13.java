package methodEx;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side of triangle");
        int firstSide = sc.nextInt();
        System.out.println("Enter second side of triangle");
        int secondSide = sc.nextInt();
        System.out.println("Enter third side of triangle");
        int thirdSide = sc.nextInt();

        double theArea = areaOfTriangle(firstSide, secondSide, thirdSide);
        System.out.println("The area of triangle = " + theArea);

    }

    public static double areaOfTriangle(double firstSide, double secondSide, double thirdSide) {
        double area = 0;

        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        return area;
    }
}
