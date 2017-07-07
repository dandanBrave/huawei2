package three;

/**
 * Created by Administrator on 2017/7/6.
 */

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();

            /*
            if (n==0){
                String A = in.next();
                String B = in.next();
                System.out.println("F");
                continue;
            }
            */


            Point[] arr = new Point[n];
            for (int i = 0; i < n; i++) {
                String A = in.next();
                String B = in.next();

                arr[i] = new Point(A,B);

            }

            String A = in.next();
            String B = in.next();
            boolean[] visited = new boolean[n];
            boolean b = getRe(B,arr,A,visited);

            if(b==true){
                System.out.println('T');
            }else{
                System.out.println('F');
            }
        }
    }

    private static boolean getRe(String b, Point[] arr, String cur, boolean[] visited) {

        if (cur.equals(b)){
            return true;
        }

        for (int i=0;i<arr.length;i++){
            String A = arr[i].x;
            if (!visited[i]){
                visited[i] = true;
                if (A.equals(cur)){
                    return getRe(b,arr,arr[i].y, visited);
                }
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
