package onehundredandseven;

/**
 * Created by Administrator on 2017/7/5.
 * 题目描述
 * 计算一个数字的立方根，不使用库函数
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double num = sc.nextDouble();
            DecimalFormat df = new DecimalFormat("0.0");
            System.out.println(df.format(getCubeRoot(num)));
        }
        sc.close();
    }
    public static double getCubeRoot(double input){
        double j = 0.0001;
        for (double i = 0; i < input ; i=i+j) {
            if((i*i*i-input>0&&i*i*i-input<0.01) || (i*i*i-input<0&&input-i*i*i<0.01)){
                return i;
            }
        }
        return 0;
    }
}
