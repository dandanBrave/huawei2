import java.util.Scanner;
/**
 * Created by Administrator on 2017/9/1.
 */
public class LianXuZiShuZuDeZuiDaHe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = sc.nextInt();
            int arr[]  = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n ; i++) {
                if(sum <= 0){
                    sum = arr[i];
                }else{
                    sum = sum + arr[i];
                }
                max = Math.max(sum,max);
            }
            System.out.println(max);
        }
    }
}
