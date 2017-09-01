import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class href {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int n = in.nextInt();
            in.nextLine();
            Set<String> result = new HashSet<String>();
            for(int i=0;i<n;i++){
                result.add(in.nextLine());
            }
            int k = in.nextInt();
            in.nextLine();
            for(int i=0;i<k;i++){
                result.remove(in.nextLine());
            }
            String[] list = new String[result.size()];
            int i=0;
            for (String str : result) {
                list[i] = str;
                i++;
            }
            Arrays.sort(list);
            for(i=0;i<list.length;i++){
                System.out.println(list[i]);
            }

        }
        in.close();
    }
}
