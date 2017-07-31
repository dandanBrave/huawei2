package eigthtyone;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/7/30.
 * 判断短字符串中的所有字符是否在长字符串中全部出现
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String strShort = sc.nextLine();
            String strLong = sc.nextLine();
            System.out.println(boolIsAllCharExist(strShort,strLong));
        }

    }
    public static boolean boolIsAllCharExist(String pShortString, String pLongString) {
        for (int i = 0; i < pShortString.length() ; i++) {
            if(pLongString.indexOf(pShortString.charAt(i))==-1){
                return false;
            }
        }
        return true;
    }
}

