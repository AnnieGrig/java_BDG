package homework_class5;

public class Rectangle5 {
    private int length;
    private int width;


    public Rectangle5() {
     int length = 14;
     int width = 5;
    }

    public Rectangle5(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength() {

        return length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    public int getWidth() {

        return width;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }


    public String toString() {
        return "Rectangle [length = " + this.length + ", " + "width = " + this.width + "]";

    }
}
