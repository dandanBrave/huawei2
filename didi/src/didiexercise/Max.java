package didiexercise;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/28.
 */
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int i=0; i< n; i++){
                if(arr[i] < 0){
                    sum = 0;
                }else{
                    sum += arr[i];
                }
                max = Math.max(max,sum);
            }
            System.out.println(max);


        }
    }
}
