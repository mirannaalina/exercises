package shapeEx;

public class Rectangle extends Shape {

    double width;
    double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width=width;
        this.length=length;
        super.color=color;
        super.filled=filled;
    }

}
