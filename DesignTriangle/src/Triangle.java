public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea(){
        return 0.25*Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side2+side3-side1)*(side3+side1-side2));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
    public String toString(){
        return super.toString() + " Triangle has side1: " + side1+" side2: "+side2+ " side3: "+ side3+ " Area: " + getArea()+" Perimeter: "+ getPerimeter();
    }
}
