import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/8.
 * 如果一个字符串由两个相同字符串连接而成,就称这个字符串是偶串。例如"xyzxyz"和"aaaaaa"是偶串,但是"ababab"和"xyzxy"却不是。
 牛牛现在给你一个只包含小写字母的偶串s,你可以从字符串s的末尾删除1和或者多个字符,保证删除之后的字符串还是一个偶串,牛牛想知道删除之后得到最长偶串长度是多少。
 */
public class EvenString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            int times = str.length()/2;
            int len = str.length();
            int sum = 0;
            if(len<2||len>200){
                return;
            }
            for (int i = 0; i < times ; i++) {
                String str1 = str.substring(0,len-2);
                int len1 = str1.length();
                String strFront = str1.substring(0,len1/2);
                String strBehind = str1.substring(len1/2);
                for (int j = 0; j < len1/2; j++) {
                    if(strFront.charAt(j)==strBehind.charAt(j)){
                        sum++;
                    }else {
                        sum=0;
                        break;
                    }
                }
                str = str1;
                len = str.length();
                if (sum>0){
                    System.out.println(sum*2);
                    break;
                }
            }

        }
    }
}
