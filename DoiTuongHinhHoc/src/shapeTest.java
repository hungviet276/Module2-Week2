import java.util.function.DoubleToIntFunction;

public class shapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle("blue",true,5);
        System.out.println(circle);
        Square square = new Square();
        System.out.println(square);
        square = new Square(5,"yellow",true);
        System.out.println(square);
    }
}
