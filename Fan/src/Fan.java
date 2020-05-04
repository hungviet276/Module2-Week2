public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String  color = "blue";
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setColor (String color){
        this.color = color;
    }
    public void setON(boolean onOFF){
        this.on = onOFF;
    }
    public String getSpeed() {
        return  String.valueOf(speed);
    }
    public String getRadius(){
        return String.valueOf(radius);
    }
    public String getColor(){
        return color;
    }
    public String isOn(){
        return String.valueOf(on);
    }
    public Fan(){
        this.speed = SLOW;
        this.on =false;
        this.radius =5;
        this.color = "blue";

    }
    public String toString(){
        String result="";
        if (on){
            result = "Status is" + isOn()+ "speed is " + getSpeed() + " radius is " + getRadius() + "color is " + getColor();
        } else result = "fan is off";
        return result;
    }

}
class main{
    public static void main(String[] args) {
        Fan newFan1 = new Fan();
        newFan1.setSpeed(newFan1.FAST);
        newFan1.setColor("yellow");
        newFan1.setON(true);
        newFan1.setRadius(10);
        Fan newFan2 = new Fan();
        newFan2.setSpeed(newFan2.MEDIUM);
        newFan2.setON(false);
        newFan2.setRadius(5);
        newFan2.setColor("blue");


    }
}

