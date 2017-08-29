import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/29.
 */
public class SliceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            int n = sc.nextInt();
            char[] arr = str.toCharArray();
            int count = 0,len = str.length();
            int i;
            for(i=0;i<len&&count<n;i++){
                if(arr[i]>128){
                    count += 2;
                }else{
                    count += 1;
                }
                if(count>n){
                    i--;
                }
            }
            System.out.println(str.substring(0,i));
        }
    }
}
