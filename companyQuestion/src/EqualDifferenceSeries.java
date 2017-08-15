import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/15.
 */
public class EqualDifferenceSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int d = arr[0] - arr[1];
            int len = arr.length;
            for (int i = 0; i < (len-1); i++) {
                if(arr[i]-arr[i+1] != d){
                    System.out.println("Impossible");
                    return;
                }
            }
            System.out.println("Possible");
        }
    }
}
