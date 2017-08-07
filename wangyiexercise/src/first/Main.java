package first;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Long a = sc.nextLong();
            int dA = sc.nextInt();
            Long b = sc.nextLong();
            int dB = sc.nextInt();
            int pA = ValueOfNum(a,dA);
            int pB = ValueOfNum(b,dB);
            System.out.println(pA+pB);
        }
    }

    private static int ValueOfNum(Long a, int dA) {
        char[] aC = a.toString().toCharArray();
        int sum=0;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < aC.length ; i++) {
            if(aC[i]==(dA+'0')){
                sum++;
            }
        }
        for (int i = 0; i < sum ; i++) {
            sb.append(dA);
        }
        return Integer.parseInt(sb.toString());
    }
}

