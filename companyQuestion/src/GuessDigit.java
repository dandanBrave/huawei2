import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/8.
 * 牛牛和羊羊在玩一个有趣的猜数游戏。在这个游戏中,牛牛玩家选择一个正整数,羊羊根据已给的提示猜这个数字。第i个提示是"Y"或者"N",表示牛牛选择的数是否是i的倍数。
 例如,如果提示是"YYNYY",它表示这个数使1,2,4,5的倍数,但不是3的倍数。
 注意到一些提示会出现错误。例如: 提示"NYYY"是错误的,因为所有的整数都是1的倍数,所以起始元素肯定不会是"N"。此外,例如"YNNY"的提示也是错误的,
 因为结果不可能是4的倍数但不是2的倍数。
 现在给出一个整数n,表示已给的提示的长度。请计算出长度为n的合法的提示的个数。
 例如 n = 5:
 合法的提示有:
 YNNNN YNNNY YNYNN YNYNY YYNNN YYNNY
 YYNYN YYNYY YYYNN YYYNY YYYYN YYYYY
 所以输出12
 */
public class GuessDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            int len = str.length();
            if(len<1||len>1000000){
                return;
            }
        }
    }
}
