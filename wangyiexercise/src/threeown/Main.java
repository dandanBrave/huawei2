package threeown;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int f = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            //f天需要支付的房租
            int rentFee = f * x;
            if(rentFee > d){
                System.out.println(d/x);
                return;
            }
            int rest = d - rentFee;
            int day = rest/(x+p);
            int allDay = day + f;
            System.out.println(allDay);
        }
    }
}