import java.util.Arrays;
import java.util.Random;

public class HW {
    public static void main(String[] args) {
        Random random = new Random();
        double [] arr = new double[15];
        arr[0]= random.nextDouble(16);
        arr[1]= random.nextDouble(16);

        for (int i = 2; i < arr.length; i++) {
            arr[i]= random.nextDouble(-16,16);
        }
        int count=0;
        boolean negetivNum = false;
        double sum=0;


        for (double res:arr){
            if (res > 0 && negetivNum){
            sum+=res;
            count++;
            }
            if (res<0&& !negetivNum){
                negetivNum = true;
            }
        }

        if (count > 0){
            double avg = sum /count;
            System.out.println("sum :"+sum + "\ncount :"+count);
            System.out.println("AVG of positive numbs: "  + avg);
        }
        else
            System.out.println("ERROR");
    }
}