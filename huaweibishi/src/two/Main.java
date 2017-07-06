package two;

/**
 * Created by Administrator on 2017/7/6.
 */
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Character> hashMap = new HashMap<Integer, Character>();
        hashMap.put(0,'F');hashMap.put(1,'G');hashMap.put(2,'R');
        hashMap.put(3,'S');hashMap.put(4,'T');hashMap.put(5,'L');
        hashMap.put(6,'M');hashMap.put(7,'N');hashMap.put(8,'O');
        hashMap.put(9,'P');hashMap.put(10,'Q');hashMap.put(11,'W');
        hashMap.put(12,'X');hashMap.put(13,'Y');hashMap.put(14,'Z');
        hashMap.put(15,'U');hashMap.put(16,'A');hashMap.put(17,'G');
        hashMap.put(18,'H');hashMap.put(19,'I');hashMap.put(20,'J');
        hashMap.put(21,'K');hashMap.put(22,'B');hashMap.put(23,'C');
        hashMap.put(24,'D');hashMap.put(25,'E');hashMap.put(26,'l');
        hashMap.put(27,'m');hashMap.put(28,'n');hashMap.put(29,'o');
        hashMap.put(30,'p');hashMap.put(31,'i');hashMap.put(32,'j');
        hashMap.put(33,'k');hashMap.put(34,'f');hashMap.put(35,'g');
        hashMap.put(36,'h');hashMap.put(37,'a');hashMap.put(38,'b');
        hashMap.put(39,'c');hashMap.put(40,'d');hashMap.put(41,'e');
        hashMap.put(42,'q');hashMap.put(43,'r');hashMap.put(44,'w');
        hashMap.put(45,'x');hashMap.put(46,'y');hashMap.put(47,'z');
        hashMap.put(48,'s');hashMap.put(49,'t');hashMap.put(50,'u');
        hashMap.put(51,'v');
        while(in.hasNext()){
            String str = in.next();

            String[] arr = str.split("[#]+");

            StringBuffer ss = new StringBuffer();

            for (int i = 0; i < arr.length; i++) {

                //System.out.println(arr[i]);

                StringBuffer sb = new StringBuffer();

                for (int j = 0; j < arr[i].length(); j++) {

                    int a = arr[i].charAt(j)=='-'?0:1;
                    sb.append(a);
                }

                long b = Long.valueOf(sb.toString(),2);

                if (b>51||b<0){
                    ss.replace(0,ss.length(),"");
                    ss.append("ERROR");
                    break;
                }else {
                    ss.append(hashMap.get((int)b));
                }
            }
            System.out.println(ss);

        }
    }

}