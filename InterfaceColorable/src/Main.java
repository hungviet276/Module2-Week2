public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5,10);
        shapes[1] = new Rectangle(6,15);
        shapes[2] = new Square(10);
        for (int i = 0; i< shapes.length;i++){
            if (shapes[i] instanceof Rectangle){
                Rectangle rectangle = (Rectangle)shapes[i];
                System.out.println(rectangle.getArea());
            } else if (shapes[i] instanceof Square){
                Square square = (Square) shapes[i];
                System.out.println(square.getArea());
                square.howToColor();
            }
        }


    }
}
