package eightyfive;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/3.
 */
public class Main {

    public static int maxLongHuiwen(String str) {
        String revStr = new StringBuffer(str).reverse().toString();
        int len = str.length();
        int [][] dp = new int[len+1][len+1];
        int max = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 1; j < len ; j++) {
                if(str.charAt(i)==revStr.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                if(dp[i][j] > max){
                    max = dp[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(maxLongHuiwen(str));
        }
        in.close();
    }
}