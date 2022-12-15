package abstract_classes;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Triangle(3, 4, 5, 4);
        System.out.println(shape1);

        shape1 = new Square(5);
        System.out.println(shape1);

        Square square = new Square(4);

        Shape[] shapes = new Shape[]{shape1, square, new Triangle(3, 4, 5, 4)};

        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape + " " + shape.calculateSquare());
        }

        double square1 = shape1.getSquare();
        double square2 = shapes[0].getSquare();
        Shape sh = shapes[0];

        System.out.println(square1);
        System.out.println(square2);
        System.out.println(sh);

        for (int i=0; i< shapes.length; i++) {
            double square3 = shapes[i].getSquare();
        }

    }
}
