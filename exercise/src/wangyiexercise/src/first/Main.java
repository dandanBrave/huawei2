package first;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        int da = scanner.nextInt();
        long b = scanner.nextLong();
        int db = scanner.nextInt();
        if(a > 0 && a < 10e10 && b > 0 && b < 10e10 && da >= 0 && da <10 && db >=0 && db < 10) {
            String sa = String.valueOf(a);
            char[] ca = sa.toCharArray();
            char cda = (char)(da+48);
            String sb = String.valueOf(b);
            char[] cb = sb.toCharArray();
            char cdb = (char)(db+48);
            int pa = 0 , pb = 0 , count_da = 0 , count_db = 0;
            for(int i=0;i<sa.length();i++)
            {
                if(ca[i] == cda)
                {
                    count_da++;
                }
            }
            for(int j=0;j<sb.length();j++){
                if(cb[j] == cdb)
                {
                    count_db++;
                }
            }
            for(int k=0;k<count_da;k++){
                pa += (da * Math.pow(10,k));
            }
            for(int l=0;l<count_db;l++){
                pb += (db * Math.pow(10,l));
            }
            System.out.println(pa + pb);
        }
    }
}
