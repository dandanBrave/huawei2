import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/15.
 */
public class ZeroOneString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] cStr = str.toCharArray();
            int len = str.length();
            int sum = 0;
            int count = 1;
            char c = cStr[0];
            for (int i = 0; i < len ; i++) {
                if(cStr[i]==c){
                    if(count>sum){
                        sum = count;
                    }
                    count = 1;
                }else{
                    count++;
                    c = cStr[i];
                }
            }
            if(count>sum){
                sum = count;
            }
            System.out.println(sum);
        }
    }
}
