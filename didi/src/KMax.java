import java.util.Arrays;
import java.util.Scanner;
/*
给定无序整数序列，求其中第K大的数，例如{45,67,33,21}，第2大数为45
输入第一行为整数序列，数字用空格分隔，如45 67 33 21
输入第二行为一个整数K，K在数组长度范围内，如2
输出第K大的数，本例为第二大数45
 */
public class KMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            int n = sc.nextInt();
            String[] strArr = str.split(" ");
            int len = strArr.length;
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length-n]);
        }
    }
}
