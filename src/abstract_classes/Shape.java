package abstract_classes;

public abstract class Shape {

    private double square;
    private int perimeter;

    public Shape() {
        //code
    }

    public abstract double calculateSquare();

    public abstract int calculatePerimeter();

    public double getSquare() {
        return square;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
