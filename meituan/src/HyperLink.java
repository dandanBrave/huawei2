import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2017/9/1.
 */
public class HyperLink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            Set<String> href = new HashSet<String>();
            for (int i = 0; i < n ; i++) {
                href.add(sc.next());
            }

            int m = sc.nextInt();
            for (int i = 0; i < m ; i++) {
                href.remove(sc.next());
            }

            String[] str = new String[href.size()];
            int i = 0;
            for(String s: href){
                str[i] = s;
                i++;
            }
            Arrays.sort(str);
            for (int j = 0; j < str.length ; j++) {
                System.out.println(str[j]);
            }
        }
    }
}
