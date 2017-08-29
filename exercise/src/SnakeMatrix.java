import java.util.Scanner;
public class SnakeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int begin = 1;
            for (int i = 1; i <= n ; i++) {
                System.out.print(begin);
                int tem = begin;
                for (int j = i+1; j <= n ; j++) {
                    tem = tem + j;
                    System.out.print(" "+tem);
                }
                System.out.println();
                begin += i;
            }
        }
    }
}