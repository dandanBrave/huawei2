package thirtysix;

/**
 * Created by Administrator on 2017/7/4.
 * 现有一组砝码，重量互不相等，分别为m1,m2,m3…mn； 每种砝码对应的数量为x1,x2,x3...xn。
 * 现在要用这些砝码去称物体的重量，问能称出多少中不同的重量。
 * 输入描述:
 * 输入包含多组测试数据。
 *对于每组测试数据：
 * 第一行：n --- 砝码数(范围[1,10])
 * 第二行：m1 m2 m3 ... mn --- 每个砝码的重量(范围[1,2000])
 * 第三行：x1 x2 x3 .... xn --- 每个砝码的数量(范围[1,6])
 * 输出描述:
 * 利用给定的砝码可以称出的不同的重量数
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] wei = new int[n];
            int[] num = new int[n];
            for (int i = 0; i < n ; i++) {
                wei[i] = sc.nextInt();
            }
            for (int i = 0; i < n ; i++) {
                num[i] = sc.nextInt();
            }
            System.out.println(fama(n,wei,num));
        }
    }
    //解题思路：以第一个砝码为基础，在其基础上不断添加，如示例：
    //砝码1的数量为2，则三种情况：0,1,2
    //砝码2的数量为1，则两种情况：0,2
    //砝码1的三种情况，添加砝码2的两种情况，分别为：0,1,2；2,3,4；去掉重复的项，则为0,1,2,3,4
    public static int fama(int n,int[] weight,int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <= nums[0] ; i++) {
            set.add(weight[0]*i);
        }
        for (int i = 1; i < n ; i++) {
            List<Integer> list = new ArrayList<Integer>(set);
            for (int j = 0; j <= nums[i]; j++) {
                for (int k = 0; k < list.size() ; k++) {
                    set.add(list.get(k) + j*weight[i]);
                }
            }
        }
        return set.size();
    }
}
