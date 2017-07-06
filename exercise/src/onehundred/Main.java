package onehundred;

/**
 * Created by Administrator on 2017/7/6.
 *功能:等差数列 2，5，8，11，14。。。。
 输入:正整数N >0
 输出:求等差数列前N项和
 返回:转换成功返回 0 ,非法输入与异常返回-1
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            System.out.println((2*num+num*(num-1)*3/2));
        }
    }
}
