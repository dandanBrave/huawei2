package one;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            char[] cStr = str.toCharArray();
            char[] letter = new char[26];
            int len = cStr.length;
            for (int i = 0; i < len; i++) {
                letter[cStr[i]-'A']++;
            }
            int sum = 0;
            for (int i = 0; i < 26; i++) {
                if(letter[i] != 0){
                    sum++;
                }
            }
            if(sum>2||sum==0){
                System.out.println(0);
            }
            if(sum==2){
                System.out.println(2);
            }
            if(sum==1){
                System.out.println(1);
            }
        }
    }

}
