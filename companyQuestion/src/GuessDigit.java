import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/8.
 * 牛牛和羊羊在玩一个有趣的猜数游戏。在这个游戏中,牛牛玩家选择一个正整数,羊羊根据已给的提示猜这个数字。第i个提示是"Y"或者"N",表示牛牛选择的数是否是i的倍数。
 * 例如,如果提示是"YYNYY",它表示这个数使1,2,4,5的倍数,但不是3的倍数。
 * 注意到一些提示会出现错误。例如: 提示"NYYY"是错误的,因为所有的整数都是1的倍数,所以起始元素肯定不会是"N"。此外,例如"YNNY"的提示也是错误的,
 * 因为结果不可能是4的倍数但不是2的倍数。
 * 现在给出一个整数n,表示已给的提示的长度。请计算出长度为n的合法的提示的个数。
 * 例如 n = 5:
 * 合法的提示有:
 * YNNNN YNNNY YNYNN YNYNY YYNNN YYNNY
 * YYNYN YYNYY YYYNN YYYNY YYYYN YYYYY
 * 所以输出12
 */
/*
首先我们分析，dp[i]表示前i个数的合法个数
1. 当第i个数是素数的时候，前面除了1都没有能除尽的，所以这个位置可以随便选Y或N,所以dp[i] = dp[i-1]*2
2. 第i个数不是素数的幂次，也就是像6这样的数字，你会发现，它已经被2,3唯一确定了，
    例如23分别是YY，那么6一定是Y，23分别是YN或NY或NN，6一定是N，所以说这时候有dp[i]=dp[i-1]
3. 当第i个数是素数的幂次的时候，也就是2，4，8，16这种数，这时候情况就复杂了。假设现在有2，4，8，那么有多少种情况呢，
   我们仔细分析也能找出规律YYY,YNN,NNN，YYN就这四种情况；对于2，4 就是YN,YY,NN三种情况
   我们发现实际上也是有规律的，首先都能或者都不能两种，然后就是从左到右添加Y：YNN,YYN。
   所以对于这种情况，我们得出规律，如果有n个幂次，就有n+1中可行的情况。

   因此，从上面分析中可以看出，长度为n的各位可以分为两类：
      - 位数为素数或素数的幂次：这些位上的可能性取决于素数的幂次且小于n的那些数。
      - 位数不是素数且不是素数的幂次：当素数位的字符确定了，这些位上的字符也都确定，即都只有一种可能性；

   分析完之后，我们就可以得出计算方法，对于12：
   2，4，8这三个数是幂次，有4中可能
   3，9 这两个数幂次，有三种可能
   5，7，11，分别是两种可能
   其他的数都由其他数决定
   所以最后结果就是4*3*2*2*2=96

   所以我们思考一下，最后就变成了找素数和素数幂次的个数了。
 */
public class GuessDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int len = sc.nextInt();
            long result = 1;
            boolean[] visited = new boolean[len+1];
            for (int i = 2; i <= len ; i++) {
                if(visited[i]){
                    continue;
                }
                for (int j = i*2; j <= len; j+=i) {
                    visited[j]=true;
                }
                long count=0;
                long k = i;  //int型会溢出
                while (k<=len){
                    k*=i;
                    count++;
                }
                result = result * (count+1) % 1000000007;
            }
            System.out.println(result);
        }
    }
}
