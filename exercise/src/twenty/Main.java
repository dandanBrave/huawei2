package twenty;
/**
 * Created by Administrator on 2017/7/1.
 * 密码要求:
 * 1.长度超过8位
 * 2.包括大小写字母.数字.其它符号,以上四种至少三种
 * 3.不能有相同长度超2的子串重复
 * 说明:长度超过2的子串
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String psw = sc.nextLine();
            if(checkLength(psw)&&checkCharKinds(psw)&&checkCharRepeat(psw)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
    //1.长度是否超过8位
    private static boolean checkLength(String psw) {
        if(psw == null || psw.length()<=8){
            return false;
        }
        return true;
    }
    //2.包括大小写字母、数字、其他符号，以上四种至少三种
    private static boolean checkCharKinds(String psw) {
        int Digit=0,lowercase=0,uppercase=0,others=0;
        char[] ch = psw.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=0&&ch[i]<=9){
                Digit=1;
            }else if(ch[i]>='a'&&ch[i]<='z'){
                lowercase=1;
            }else if(ch[i]>='A'&&ch[i]<='Z'){
                uppercase=1;
            }else{
                others=1;
            }
        }
        int total = Digit+lowercase+uppercase+others;
        if(total<3){
            return false;
        }
        return true;
    }
    //3.不能有相同长度超过2的字串重复
    private static boolean checkCharRepeat(String psw) {
        for(int i=0;i<psw.length()-2;i++){
            String sub = psw.substring(i,i+3);
            if(psw.substring(i+1).contains(sub)){
                return false;
            }
        }
        return true;
    }
}
