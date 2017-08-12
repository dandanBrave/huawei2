package twoown;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] cStr = str.toCharArray();
            int len = str.length();
            if (len < 1 || len > 50) {
                return;
            }
            char first = cStr[0];
            int num = 1;
            int count = 0;
            for (int i = 0; i < len ; i++) {
                if(cStr[i]!=first){
                    first = cStr[i];
                    num++;
                }else{
                    if(num > count){
                        count = num;
                    }
                    num = 1;
                }
            }
            if(num > count){
                count = num;
            }
            System.out.println(count);
        }
    }
}