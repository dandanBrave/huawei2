import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/6.
 * 复杂度高
 */
public class ChouShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(GetUglyNumber_Solution(n));
    }
    public static int GetUglyNumber_Solution(int index) {
        if(index<=0){
            return 0;
        }
        int number = 0;   //判断了多少个数
        int uglySum = 0;    //丑数的个数
        while(uglySum<index){
            ++number;
            if(IsUgly(number)){
                ++uglySum;
            }
        }
        return number;
    }

    public static boolean IsUgly(int number){
        while (number%2 == 0){
            number /= 2;
        }
        while (number%3 == 0){
            number /= 3;
        }
        while (number%5 == 0){
            number /= 5;
        }
        return number==1?true:false;
    }
}
