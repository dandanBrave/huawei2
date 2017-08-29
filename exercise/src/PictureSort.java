import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/29.
 */
public class PictureSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] cStr = str.toCharArray();
            Arrays.sort(cStr);
            System.out.println(cStr);
        }
    }
}
