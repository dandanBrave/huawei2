package onehundredandfour;

/**
 * Created by Administrator on 2017/7/5.
 * 连续输入字符串(输出次数为N,字符串长度小于100)，请按长度为8拆分每个字符串后输出到新的字符串数组，
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 首先输入一个整数，为要输入的字符串个数。
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < num ; i++) {
                String str = sc.nextLine();
                strSplit(str);
            }

        }
    }
    private static void strSplit(String s){
        if(s == null){
            return;
        }
        int n = s.length()%8;
        StringBuffer sb = new StringBuffer(s);
        if(n!=0){
            for (int i = 8-n ; i > 0 ; i--) {
                sb.append('0');
            }
        }
        for (int i = 0; i < sb.toString().length() ; i+=8) {
            System.out.println(sb.substring(i,i+8));
        }
    }

}
