import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(5.0f, 6.0f);
        System.out.println(point);
        MoveAblePoint moveAblePoint = new MoveAblePoint(5.0f, 6.0f, 7.0f, 8.0f);
        System.out.println(moveAblePoint);
        System.out.println(Arrays.toString(moveAblePoint.move()));


    }
}
