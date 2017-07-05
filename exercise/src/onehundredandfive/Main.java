package onehundredandfive;

/**
 * Created by Administrator on 2017/7/5.
 * 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNeg = 0,countPos = 0,sum= 0;
        while(sc.hasNext()){
            int num = sc.nextInt();
            if(num<0){
                countNeg++;
            }else{
                countPos++;
                sum+=num;
            }
        }
        System.out.println(countNeg);
        System.out.printf("%.1f",(sum+0.0)/countPos);
    }
}
