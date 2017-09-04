import java.util.Scanner;
//简单的直观方法，效率不好
public class ZhengShuZhong1DeGeShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(NumberOf1Between1AndN_Solution(a));
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += NumberOf1(i);
        }
        return sum;
    }
    public static int NumberOf1(int n){
        int sum = 0;
        while(n != 0){
            if(n%10 == 1){
                sum++;
            }
            n = n/10;
        }
        return sum;
    }
}

