import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/22.
 */
public class NPeopleDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            LinkedList<Character> arrL = new LinkedList<Character>();
            arrL.add('S');
            arrL.add('L');
            arrL.add('P');
            arrL.add('R');
            arrL.add('H');
            int N = sc.nextInt();
            int num = 1;
            while(num<=N){
                Character a;
                if(num==N){
                    a = arrL.peekFirst();
                    arrL.addLast(a);
                    arrL.addLast(a);
                    break;
                }
                a = arrL.pollFirst();
                arrL.addLast(a);
                arrL.addLast(a);
                num++;

            }
            System.out.println(arrL.peek());
        }
    }
}
