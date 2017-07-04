package forty;

/**
 * Created by Administrator on 2017/7/4.
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 * 输入描述:
 * 输入一行字符串，可以有空格
 * 输出描述:
 * 统计其中英文字符，空格字符，数字字符，其他字符的个数
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(getEnglishCharCount(str));
            System.out.println(getBlankCharCount(str));
            System.out.println(getNumberCharCount(str));
            System.out.println(getOtherCharCount(str));
        }
    }

    public static int getEnglishCharCount(String str) {
        char[] chars = str.toCharArray();
        int sumEng = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z') {
                sumEng++;
            }
        }
        return sumEng;
    }

    public static int getBlankCharCount(String str) {
        char[] chars = str.toCharArray();
        int sumsq = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                sumsq++;
            }
        }
        return sumsq;
    }

    public static int getNumberCharCount(String str) {
        char[] chars = str.toCharArray();
        int sumdig = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                sumdig++;
            }
        }
        return sumdig;
    }

    public static int getOtherCharCount(String str) {
        char[] chars = str.toCharArray();
        int sumoth = 0;
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z'
                    || chars[i] == ' ' || chars[i] >= '0' && chars[i] <= '9')) {
                sumoth++;
            }
        }
        return sumoth;
    }
}
