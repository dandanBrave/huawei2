import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/15.
 */
public class OperateSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }

            LinkedList list = new LinkedList();

            int size = arr.length;
            if(size%2==0){
                for (int i = 0; i < n; i++) {
                    if(i%2!=0){
                        list.addFirst(arr[i]);
                    }else {
                        list.add(arr[i]);
                    }
                }
            }else {
                for (int i = 0; i < n; i++) {
                    if(i%2==0){
                        list.addFirst(arr[i]);
                    }else {
                        list.add(arr[i]);
                    }
                }
            }

            while(list.size()>1){
                System.out.print(list.poll()+" ");
            }
            System.out.print(list.poll());
        }
    }
}
