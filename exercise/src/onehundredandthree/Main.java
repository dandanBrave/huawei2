package onehundredandthree;

/**
 * Created by Administrator on 2017/7/6.
 *  Redraiment是走梅花桩的高手。Redraiment总是起点不限，从前到后，往高的桩子走，
 *  但走的步数最多，不知道为什么？你能替Redraiment研究他最多走的步数吗？
 样例输入
 6
 2 5 1 5 4 5
 样例输出
 3
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] pInput = new int[num];
            for (int i = 0; i < num ; i++) {
                pInput[i]=sc.nextInt();
            }
            System.out.println(getMaxStep(pInput,num));
        }
    }

    /*
    求解指定数组的最长升序子数组的长度
    f数组存放的是原数组的下标值，根据下标就可以得到序列
     */
    private static int getMaxStep(int[] pInput, int num) {
        int[] f = new int[num];
        for (int i = 0; i < num ; i++) {
            f[i]=1;
            for (int j = 0; j < i ; j++) {
                if(pInput[j]<pInput[i]&&f[j]+1>f[i]){
                    f[i]=f[i]+1;
                }
            }
        }
        int max = 1;
        for (int i = 0; i < num; i++) {
            if(max<f[i]){
                max=f[i];
            }
        }
        return max;
    }
}
