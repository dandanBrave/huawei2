package three;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            int f = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            int xOne = f * x;
            if(xOne>d){
                System.out.println(d/x);
                return;
            }
            int money = d -xOne;
            int day = money / (x+p);
            int allDayCount = day + f;
            System.out.println(allDayCount);
        }
    }

}
