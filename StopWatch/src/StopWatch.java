
import java.util.Date;

public class StopWatch {
    Date date = new Date();
    private long startTime;
    private long endTime;
    public StopWatch(){

        this.startTime = date.getTime();
    }
    public void start(){
        this.startTime = date.getTime();
    }
    public void stop(){
        this.endTime = date.getTime();
    }
    public double getStartTime(){
        return this.startTime;
    }public double getEndTime(){
        return this.endTime;
    }
    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }
}
class main{
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] array = new int[100000];
        for (int i =0; i < array.length;i++){
            array[i]= (int)Math.floor(Math.random()*100+10);
        }
        for (int j =0; j< array.length;j++){
            int min = array[j]; int temp; int indexMin =j;
            for (int k =j;k< array.length;k++){
                if (array[k]<min){
                    min = array[k];
                     indexMin = k;
                }

            }
            temp = array[j];
            array[j] = array[indexMin];
            array[indexMin]=temp;
        }

        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());


    }
}
