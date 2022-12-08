package abstract_classes;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(int a, int b, int c, int h) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        calculateSquare();
        calculatePerimeter();
    }

    @Override
    public double calculateSquare() {
        double square = (h * c) / 2.0;
        setSquare(square);
        return square;
    }

    @Override
    public int calculatePerimeter() {
        int perimeter = a + b + c;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                "} " + super.toString();
    }
}
