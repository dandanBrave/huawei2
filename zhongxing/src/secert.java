import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class secert {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (sc.hasNext()){
            long n = sc.nextLong();
            if(n>100000||n<-100000||n==0){
                return;
            }
            String a = (n>0?n:-1*n) + "";
            TreeMap<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

            for (int i = 0; i < a.length() ; i++) {
                //char型转换成int型：Character.getNumericValue()方法
                int c = Character.getNumericValue(a.charAt(i));
                if(treeMap.containsKey(c)){
                    treeMap.put(c,treeMap.get(c)+1);
                }else{
                    treeMap.put(c,1);
                }
            }
            StringBuffer sb = new StringBuffer();
            int sum = 0;
            for(Map.Entry<Integer,Integer> map: treeMap.entrySet()){
                int key = map.getKey();
                int value = map.getValue();
                while(value>0){
                    if(key == 0){
                        sum ++;
                    }
                    sb.append(key);
                    value--;
                }
            }
            if(n>0){
                if(sum>0){
                    char x = sb.charAt(0);
                    char y = sb.charAt(sum);
                    sb.setCharAt(0,y);
                    sb.setCharAt(sum,x);
                }
                System.out.println(Integer.valueOf(sb.toString()));
            }else{
                System.out.println(-1*Integer.valueOf(sb.reverse().toString()));
            }
        }
    }
}