package one;

/**
 * Created by Administrator on 2017/7/6.
 * 输出1000以内的水仙花数
 */
public class Main {
    public static void main(String[] args) {
        int index = 0,sum=0;
        for (int i = 100; i < 1000 ; i++) {
            int a = i/100;
            int b = i%100;
            int c = b/10;
            int d = b%10;
            if((a*a*a+c*c*c+d*d*d)==i){
                index=index+1;
                sum += i;
                System.out.println("第"+index+"个水仙花数: "+i);
            }
        }
        System.out.println("水仙花数总和为: "+sum);

    }

}
