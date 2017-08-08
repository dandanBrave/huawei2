import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/8.
 * 牛牛有一些字母卡片,每张卡片上都有一个小写字母,所有卡片组成一个字符串s。牛牛一直认为回文这种性质十分优雅,于是牛牛希望用这些卡片拼凑出一些回文串,但是有以下要求:
 1、每张卡片只能使用一次
 2、要求构成的回文串的数量最少
 牛牛想知道用这些字母卡片,最少能拼凑出多少个回文串。
 例如: s = "abbaa",输出1,因为最少可以拼凑出"ababa"这一个回文串
 s = "abc", 输出3,因为最少只能拼凑出"a","b","c"这三个回文串
 */
public class MakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            int len = str.length();

            if(len<1||len>1000){
                return;
            }
            for (int i = 0; i < len ; i++) {

            }
        }
    }
}
