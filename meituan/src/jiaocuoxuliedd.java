import java.util.Scanner;

public class jiaocuoxuliedd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 1;
            int begin = arr[0];
            for (int i = 1; i < n ; i++) {
                if(begin != arr[i]){
                    sum++;
                    begin = arr[i];
                }
            }
            System.out.println(sum);
        }
    }
}