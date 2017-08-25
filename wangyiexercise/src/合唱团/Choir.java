package 合唱团;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/11.
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * 要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 */
public class Choir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int d = sc.nextInt();

        }
    }
}
