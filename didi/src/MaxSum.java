/*
给定无序整数序列，求连续字串最大和，例如{-23 17 -7 11 -2 1 -34},字串为{17，-7,11}，最大和为21
 */
import java.util.Scanner;
public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            int len = strArr.length;
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
            int sum = 0,max = arr[0];
            for (int i = 0; i < len; i++) {
                sum += arr[i] ;
                if(sum<0){
                    sum = 0;
                }else if(sum>max){
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
