import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle = new ComparableCircle[3];
        comparableCircle[0] = new ComparableCircle(3.6);
        comparableCircle[1] = new ComparableCircle();
        comparableCircle[2] = new ComparableCircle(3.5,"red",false);
        System.out.println("Pre-sorted");
        for (int i = 0; i< comparableCircle.length;i++){
            System.out.println(comparableCircle[i]);
        }
        Arrays.sort(comparableCircle);
        System.out.println("After-sorted:");
        for (int i = 0; i< comparableCircle.length;i++){
            System.out.println(comparableCircle[i]);
        }

    }
}
