package DanTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/14.
 */
public class TelegraphTranslate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            Map<Integer,Character> digValue = new HashMap<Integer,Character>();
            digValue.put(0,'F'); digValue.put(1,'G'); digValue.put(2,'R');  digValue.put(3,'S');
            digValue.put(4,'T'); digValue.put(5,'L'); digValue.put(6,'M');  digValue.put(7,'N');
            digValue.put(8,'O'); digValue.put(9,'P'); digValue.put(10,'Q'); digValue.put(11,'W');
            digValue.put(12,'X');digValue.put(13,'Y');digValue.put(14,'Z'); digValue.put(15,'U');
            digValue.put(16,'A');digValue.put(17,'V');digValue.put(18,'H'); digValue.put(19,'I');
            digValue.put(20,'J');digValue.put(21,'K');digValue.put(22,'B');digValue.put(23,'C');
            digValue.put(24,'D');digValue.put(25,'E');digValue.put(26,'p');digValue.put(27,'i');
            digValue.put(28,'j');digValue.put(29,'k');digValue.put(30,'f');digValue.put(31,'g');
            digValue.put(32,'h');digValue.put(33,'l');digValue.put(34,'m');digValue.put(35,'n');
            digValue.put(36,'o');digValue.put(37,'e');digValue.put(38,'q');digValue.put(39,'r');
            digValue.put(40,'w');digValue.put(41,'x');digValue.put(42,'y');digValue.put(43,'z');
            digValue.put(44,'a');digValue.put(45,'b');digValue.put(46,'c');digValue.put(47,'d');
            digValue.put(48,'s');digValue.put(49,'t');digValue.put(50,'u');digValue.put(51,'v');

            if(str.indexOf(".") < 0 && str.indexOf("-")<0){
                return;
            }
            StringBuffer sb = new StringBuffer();
            String[] arr = str.split("[#]+");

            for (int i = 0; i < arr.length ; i++) {
                int sum = 0;
                char[] potArr = arr[i].toCharArray();
                int k = 0;
                for (int j = arr[i].length()-1; j >= 0 ; j--) {
                    if(potArr[j]=='.'){
                        sum = sum + 1* (int)Math.pow(2,k++);
                    }else if(potArr[j]=='-'){
                        sum = sum + 0*(int)Math.pow(2,k++);
                    }
                }
                if(sum>51 || sum<0){
                    System.out.println("ERROR");
                    break;
                }else{
                    sb.append(digValue.get(sum));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
