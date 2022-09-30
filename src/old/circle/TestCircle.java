package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("Circle area is " + c1.getArea());
        System.out.println("Circle radius is " + c1.getRadius());

        Circle c2 = new Circle(2.0);
        System.out.println("Circle area is " + c1.getArea() + "\nCircle radius is " + c1.getRadius());

        Circle c4 = new Circle(5.5);
        System.out.println("Circle radius is " + c4.getRadius());
        c4.setColor("Green");
        System.out.println("Circle color is " + c4.getColor());

        System.out.println(c4);
        System.out.println(c4);
        c4.toString();
        c4.getInfo();
    }
}
