package tiantainone;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            String[] s = str.split(",");
            int len = s.length;
            String result = "";
            for (int i = 0; i < len ; i++) {
                String str1 = s[i].substring(2);
                StringBuffer sb = new StringBuffer(str1);
                String s1=sb.reverse().toString();
                if(s1.charAt(1)=='F'){
                    s1 = s1.substring(0,1);
                }
                result += s1;
            }
            System.out.print(result);
        }
    }

}
