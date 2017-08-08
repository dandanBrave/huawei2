import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/8.
 * 牛牛有一些字母卡片,每张卡片上都有一个小写字母,所有卡片组成一个字符串s。牛牛一直认为回文这种性质十分优雅,于是牛牛希望用这些卡片拼凑出一些回文串,但是有以下要求:
 * 1、每张卡片只能使用一次
 * 2、要求构成的回文串的数量最少
 * 牛牛想知道用这些字母卡片,最少能拼凑出多少个回文串。
 * 例如: s = "abbaa",输出1,因为最少可以拼凑出"ababa"这一个回文串
 * s = "abc", 输出3,因为最少只能拼凑出"a","b","c"这三个回文串
 */
/*
本题思路为找出字符串中奇数个出现字符的个数
 */
public class MakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            System.out.println(Palindrome(str));
        }
    }
    private static int Palindrome(String str) {
        int len = str.length();
        int count = 0;
        if(len<1||len>1000){
            return 0;
        }
        int[] sumOfLetter = new int[26];
        char[] letter = str.toCharArray();
        for (int i = 0; i < len ; i++) {
            sumOfLetter[letter[i]-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(sumOfLetter[i]%2 != 0){
                count++;
            }
        }
        return count;
    }
}
 