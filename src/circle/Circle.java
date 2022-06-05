package circle;

public class Circle {
    private double radius;
    private String color;


    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {

    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public String toString(){
        return "Circle[radius=" + this.radius + " color=" + this.color + "]";
    }

    public void getInfo(){
        System.out.println("Info: Circle[radius=" + this.radius + " color=" + this.color + "]");
    }

}
