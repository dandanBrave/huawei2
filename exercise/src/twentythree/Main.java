package twentythree;
/**
 * Created by Administrator on 2017/7/4.
 * 题目描述
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
 * 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 *
 * 输入描述:
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 * 输出描述:
 * 删除字符串中出现次数最少的字符后的字符串。
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int[] num = new int[26];
            String str = sc.nextLine();
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                int n = (int)(c-'a');
                num[n]++;
            }
            int min = Integer.MAX_VALUE;
            for(int i=0;i<str.length();i++){
                if(num[i]!=0 && num[i]<min){
                    min = num[i];
                }
            }
            for (int i = 0; i < str.length() ; i++) {
                char c = str.charAt(i);
                int n = (int)(c-'a');
                if(num[n] != min){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
