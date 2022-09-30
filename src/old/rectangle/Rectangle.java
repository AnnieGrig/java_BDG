package rectangle;

public class Rectangle {
    private float length;
    private float width;


    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (this.length * this.width);
        return perimeter;
    }

    public String toString() {
        return "Rectangle [length = " + this.length + ", " + "width = " + this.width + "]";

    }
}
