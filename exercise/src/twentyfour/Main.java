package twentyfour;
//跳过了
/**
 * Created by Administrator on 2017/7/4.
 * 题目描述
 计算最少出列多少位同学，使得剩下的同学排成合唱队形
 说明：
 N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 输入描述:
 整数N
 输出描述:
 最少需要几位同学出列
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            int[] height = new int[N];
            for (int i = 0; i < N; i++) {
                height[i] = sc.nextInt();
            }



        }
    }
}
