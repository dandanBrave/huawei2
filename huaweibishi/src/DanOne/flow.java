package DanOne;
/**
 * Created by Administrator on 2017/9/14.
 */
public class flow {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i < 1000 ; i++) {
            int a = i%10;   //个位
            int b = (i/10)%10;  //十位
            int c = i/100;  //百位
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println("第"+ sum++ +"个水仙花数: " + i);
            }
        }
    }
}
