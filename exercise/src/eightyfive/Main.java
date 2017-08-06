package eightyfive;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/3.
 * Catcher 是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，
 * 但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,
 * 123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），
 * Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
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