package onehundredandsix;

/**
 * Created by Administrator on 2017/7/5.
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 * 如：输入“I am a student”，输出“tneduts a ma I”。
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            StringBuffer sb = new StringBuffer(str);
            System.out.println(sb.reverse().toString());
        }
    }
}
