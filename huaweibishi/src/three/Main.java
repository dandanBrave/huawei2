package three;

/**
 * Created by lin on 2017/4/30.
 * 函数之间的循环调用
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if (n==0){
                String A = in.next();
                String B = in.next();
                System.out.println("F");
                continue;
            }
            Point[] arr = new Point[n];
            for (int i = 0; i < n; i++) {
                String A = in.next();
                String B = in.next();

                arr[i] = new Point(A,B);

            }
            String A = in.next();
            String B = in.next();
            boolean[] visited = new boolean[n];
            boolean b = getRe(A,arr,B,visited);
            boolean b2 = getRe(B,arr,A,new boolean[n]);

            if (b&&b2){
                System.out.println("T");
            }else {
                System.out.println("F");
            }
        }
    }

    private static boolean getRe(String cur, Point[] arr, String b, boolean[] visited) {

        if (cur.equals(b)){
            return true;
        }

        for (int i=0;i<arr.length;i++){
            String X = arr[i].x;
            if (!visited[i]){
                visited[i] = true;
                if (X.equals(cur)&&getRe(arr[i].y,arr,b,visited))
                    return true;
                visited[i] = false;
            }
        }

        return false;
    }


}
class Point{
    String x;
    String y;
    public Point(String x,String y){
        this.x = x;
        this.y = y;
    }
}
