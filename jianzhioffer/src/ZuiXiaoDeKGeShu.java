import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/5.
 */
public class ZuiXiaoDeKGeShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            System.out.println(GetLeastNumbers_Solution(num,m).toString());
        }
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if(k>input.length || k==0){
            return al;
        }
        Arrays.sort(input);
        for (int i = 0; i < k ; i++) {
            al.add(input[i]);
        }
        return al;
    }
}
