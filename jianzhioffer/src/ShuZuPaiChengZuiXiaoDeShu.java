import java.io.CharArrayReader;
import java.util.*;

/**
 * Created by Administrator on 2017/9/4.
 */
public class ShuZuPaiChengZuiXiaoDeShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(PrintMinNumber(arr));
    }
    public static String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length ; i++) {
            al.add(numbers[i]);
        }
        Collections.sort(al,new Comparator<Integer>(){
            @Override
            public int compare(Integer str1, Integer str2) {
               String s1 = str1 + "" + str2;
               String s2 = str2 + "" + str1;
               return s1.compareTo(s2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i:al) {
            sb.append(i);
        }
        return sb.toString();
    }
}
