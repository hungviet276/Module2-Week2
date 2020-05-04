public class Circle {
    private double radius =1;
    private String color ="red";
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 2*Math.PI*radius;
    }
}

