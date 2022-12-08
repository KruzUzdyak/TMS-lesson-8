package abstract_classes;

public class Square extends Shape {

    private int a;

    public Square(int a) {
        this.a = a;
        calculateSquare();
        calculatePerimeter();
    }

    @Override
    public double calculateSquare() {
        double square = a * a;
        setSquare(square);
        return square;
    }

    @Override
    public int calculatePerimeter() {
        int perimeter = 4 * a;
        setPerimeter(perimeter);
        return perimeter;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                "} " + super.toString();
    }
}
