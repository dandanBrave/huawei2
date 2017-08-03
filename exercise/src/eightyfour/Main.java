package eightyfour;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/2.
 * 找出给定字符串中大写字符(即'A'-'Z')的个数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(CalcCapital(str));
        }

    }

    public static int CalcCapital(String str) {
        int sum = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(65<=str.charAt(i)&&str.charAt(i)<=90){
                sum++;
            }
        }
        return sum;
    }
}
