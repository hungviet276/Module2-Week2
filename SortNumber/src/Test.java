import java.util.Arrays;
import java.util.Comparator;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Number[] numbers = new Number[1000000];
        for (int i =0; i < numbers.length;i++){
            int random = (int)Math.floor(Math.random()*100000);
            numbers[i] = new Number(random);
        }
        SortNumber sortNumber = new SortNumber();
        int startTime= (int)System.currentTimeMillis();
        Arrays.sort(numbers,sortNumber);
        int stopTime= (int)System.currentTimeMillis();
        System.out.println("time to sort is "+ (stopTime-startTime)+" milliseconds");

//        for (int i =0; i< numbers.length;i++){
//            System.out.print(numbers[i].number + "\t");
//        }

    }
}


 class SortNumber implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        if (o1.number>o2.number)return 1;
        else if (o1.number<o2.number)return -1;
        else return 0;
    }
}
 class Number {
    public int number;
    public Number(int number){
        this.number = number;
    }
}
