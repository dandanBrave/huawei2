package second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int L = sc.nextInt();
            System.out.println(NumOfCD(n,s,L));
        }
    }

    private static int NumOfCD(int n, int s, int l) {
        if(n>100 || s>l || l>10000 || s>10000){
            return -1;
        }
        int count  = (l+1)/(s+1);
        count = Math.min(n,count);
        if(count%13==0){
            count--;
        }
        int sum = n/count;
        int re = n%count;
        if(re>0){
            sum++;
            if(re%13==0&&(count-re==1)){
                sum++;
            }
        }
        return sum;
    }
}
