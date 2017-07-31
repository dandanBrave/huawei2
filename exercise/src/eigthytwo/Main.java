package eigthytwo;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/31.
 * 分子为1的分数称为埃及分数。现输入一个真分数(分子比分母小的分数，叫做真分数)，
 * 请将该分数分解为埃及分数。如：8/11 = 1/2+1/5+1/55+1/110。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(ConvertRealFractToEgpytFract(str));
        }
    }

    //将真分数转化为埃及分数
    public static String ConvertRealFractToEgpytFract(String pcRealFraction) {

        String[] parts = pcRealFraction.split("/");

        // 分子
        int a = Integer.parseInt(parts[0]);
        // 分母
        int b = Integer.parseInt(parts[1]);
        StringBuilder builder = new StringBuilder(64);

        int c;
        while (a != 1) {
            if (b % (a - 1) == 0) {
                builder.append("1/").append(b / (a - 1)).append('+');
                a = 1;
            } else {
                c = b / a + 1;
                builder.append("1/").append(c).append('+');
                a = a * c - b;
                b = c * b;
                if (b % a == 0) {
                    b = b / a;
                    a = 1;
                }
            }
        }
        builder.append("1/").append(b);
        return builder.toString();

    }
}