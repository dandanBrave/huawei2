import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/5.
 */
public class ShuZuChaoGuoYiBanDeShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            System.out.println(MoreThanHalfNum_Solution(num));
        }
    }
    public static int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        if(len<1){
            return 0;
        }
        int count = 0;
        Arrays.sort(array);
        int number = array[len/2];
        for (int i = 0; i < len ; i++) {
            if(number==array[i]){
                count++;
            }
        }

        if(count<=len/2){
            number = 0;
        }
        return number;
    }
}
