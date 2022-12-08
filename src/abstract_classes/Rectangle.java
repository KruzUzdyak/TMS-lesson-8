package abstract_classes;

public class Rectangle extends Square {

    private int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
        calculateSquare();
        calculatePerimeter();
    }

    @Override
    public double calculateSquare() {
        double square = getA() * b;
        setSquare(square);
        return square;
    }

    @Override
    public int calculatePerimeter() {
        int perimeter = 2 * getA() + 2 * b;
        setPerimeter(perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "b=" + b +
                "} " + super.toString();
    }
}
