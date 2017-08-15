import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/15.
 */
public class OperateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; i++) {
                sb.append(arr[i]).reverse();
            }
            String str = sb.toString();
            char[] cStr = str.toCharArray();
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < n-1 ; i++) {
                result.append(cStr[i] + " ");
            }
            result.append(cStr[n-1]);
            System.out.println(result.toString());

        }
    }
}
