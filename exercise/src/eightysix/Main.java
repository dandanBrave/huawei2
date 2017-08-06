package eightysix;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/6.
 * 功能: 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(numOfOne(num));
        }
    }

    private static int numOfOne(int num) {
        String binNum = Integer.toBinaryString(num);
        //System.out.println(binNum);
        int max = 0;
        int len = 0;
        int length = binNum.length();
        for (int i = 0; i < length; i++) {
            if(binNum.charAt(i) == '1'){
                len++;
                if(len>max){
                    max = len;
                }
            }else {
                len = 0;
            }
        }
        return max;
    }
}
