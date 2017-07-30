package third;

/**
 * Created by Administrator on 2017/7/7.
 * 函数的循环调用
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            Point[] arr = new Point[n];
            for (int i = 0; i < arr.length ; i++) {
                String x = sc.next();
                String y = sc.next();
                arr[i] =  new Point(x,y);
            }
            String A = sc.next();
            String B = sc.next();

            boolean [] visited = new boolean[n];
            boolean b = getRe(B,arr,A,visited);
            if(b==true){
                System.out.println('T');
            }else{
                System.out.println('F');
            }
        }
    }

    private static boolean getRe(String b, Point[] arr, String a, boolean[] visited) {
        if(a.equals(b)){
            return true;
        }
        for (int i=0;i<arr.length;i++){
            String A = arr[i].x;
            if (!visited[i]){
                visited[i] = true;
                if (A.equals(a)){
                    return getRe(b,arr,arr[i].y, visited);
                }
                visited[i] = false;
            }
        }

        return false;


    }

    static class Point{
        String x;
        String y;
        public Point(String x, String y){
            this.x = x;
            this.y = y;
        }

    }
}
