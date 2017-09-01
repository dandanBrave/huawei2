import java.util.Scanner;

public class jiaocuoxulie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int n = in.nextInt();
            int[] list = new int[n];
            for(int i=0;i<n;i++){
                list[i] = in.nextInt();
            }
            int result = 0;
            int last = -1;
            for(int i=0;i<n;i++){
                if(last!=list[i]){
                    result++;
                    last = list[i];
                }
            }
            System.out.println(result);
        }
        in.close();
    }
}

