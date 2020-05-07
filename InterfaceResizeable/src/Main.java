public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,10);
        Square square = new Square(10);
        System.out.println(circle.getArea()+circle.getPerimeter());
        System.out.println(rectangle.getArea()+rectangle.getPerimeter());
        System.out.println(square.getArea()+square.getPerimeter());

        circle.resizeable((double)Math.floor(Math.random()*100));
        rectangle.resizeable((double)Math.floor(Math.random()*100));
        square.resizeable((double)Math.floor(Math.random()*100));

        System.out.println(circle.getArea()+circle.getPerimeter());
        System.out.println(rectangle.getArea()+rectangle.getPerimeter());
        System.out.println(square.getArea()+square.getPerimeter());

    }
}
