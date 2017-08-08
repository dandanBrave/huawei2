package second;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/7.
 *你作为一名出道的歌手终于要出自己的第一份专辑了，你计划收录 n 首歌而且每首歌的长度都是 s 秒，
 * 每首歌必须完整地收录于一张 CD当中。每张 CD 的容量长度都是 L 秒，而且你至少得保证同一张 CD 内相邻两首歌中间至少要隔 1 秒。
 * 为了辟邪，你决定任意一张 CD内的歌数不能被 13 这个数字整除，那么请问你出这张专辑至少需要多少张 CD ？
 */
/*
思路： 首先先确定一张cd最多能放几首歌，用数学来算，假设是t首，那么t*s + t -1 = l ，所以t = （l+1） /( s+1) ;
 算出一张cd包含的歌曲数量，这里要验证一下t是不是13的倍数，如果是13的倍数，每张cd的歌曲数量要减一，即  t -= 1 ；
   然后看最后是不是会剩下几首并且剩下的又恰好事13的倍数，如果是还要看一下最后剩下的和平均歌曲量是不是只差1，
   如果只差1就只能，把剩下的是13的倍数拆成2张cd，也就是说需要的cd数加1，如果剩下的歌曲是13的倍数但是比平均歌曲量少1个以上，则可以允一下，
   也就是说cd数量不用增加。
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            //n表示总共的歌曲数量，s表示每首歌的时间长度，L表示一张CD的时间长度
            int n = sc.nextInt();
            int s = sc.nextInt();
            int L = sc.nextInt();
            System.out.println(NumOfCD(n,s,L));
        }
    }

    private static int NumOfCD(int n, int s, int L) {
        if(n>100 || s>L || L>10000 || s>10000){
            return -1;
        }
        //一张CD最多可放多少首歌，假如为t首，则t*s+t-1=L.于是t=(L+1)/(s+1）。
        int t = (L+1)/(s+1);
        //如果总共的歌曲数量少于每张CD可以放的数量，则将t设为n
        if(n<t){
            t = n;
        }
        //如果t被13整除，则t要减一
        if(t%13==0){
            t--;
        }
        int sum = n/t;
        //剩余的歌曲数
        int re = n%t;
        //只要剩余的歌曲数大于0，需要的CD数就加1
        if(re>0){
            sum++;
            //如果剩余的歌曲数目刚好被13整除，并且剩余歌曲数比每张CD可容纳的数目少1的话，需要的CD数需要额外再多一张，
            // 如果剩余歌曲数比每张CD可容纳的数目少一个以上的话，可以把倒数第二张的歌曲数匀给最后一张CD，这样就不需要增加CD数目
            if(re%13==0&&t-re==1){
                sum++;
            }
        }
        return sum;
    }
}
