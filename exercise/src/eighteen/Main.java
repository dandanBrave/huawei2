package eighteen;
//跳过了
/**
 * Created by Administrator on 2017/7/3.
 * 请解析IP地址和对应的掩码，进行分类识别。要求按照A/B/C/D/E类地址归类，不合法的地址和掩码单独归类。
 * 所有的IP地址划分为 A,B,C,D,E五类
 A类地址1.0.0.0~126.255.255.255;
 B类地址128.0.0.0~191.255.255.255;
 C类地址192.0.0.0~223.255.255.255;
 D类地址224.0.0.0~239.255.255.255；
 E类地址240.0.0.0~255.255.255.255
 私网IP范围是：
 10.0.0.0～10.255.255.255
 172.16.0.0～172.31.255.255
 192.168.0.0～192.168.255.255
 子网掩码为前面是连续的1，然后全是0。（例如：255.255.255.32就是一个非法的掩码）
 本题暂时默认以0开头的IP地址是合法的，比如0.1.1.2，是合法地址
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
        }
    }
}
