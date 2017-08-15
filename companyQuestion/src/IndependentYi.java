import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/15.
 */
public class IndependentYi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            //x表示房租，f表示已有水果个数，d表示拥有钱数，p表示每个水果的钱数
            int x = sc.nextInt();
            int f = sc.nextInt();
            int d = sc.nextInt();
            int p = sc.nextInt();
            //f天需要的房租钱
            int money = x * f;
            int day = d/x;
            if(money > d){
                System.out.println(day);
                return;
            }
            int rest = d - money;
            day = rest / (x + p);
            System.out.println(day+f);
        }
    }
}