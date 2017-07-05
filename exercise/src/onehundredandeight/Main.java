package onehundredandeight;

/**
 * Created by Administrator on 2017/7/5.
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 输入描述:
 * 输入两个正整数A和B。
 * 输出描述:
 * 输出A和B的最小公倍数。
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A*B/MaxCommonDivisor(A,B));
        }
    }
    private static int MaxCommonDivisor(int a, int b) {
        int r = a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
}
