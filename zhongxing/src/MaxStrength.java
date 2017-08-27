import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Administrator on 2017/8/27.
 */
public class MaxStrength {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{2,3},{7,8},{5,6},{7,9},{4,5}};
        int[] stre = {25,34,23,45,16,51,29,38,47};
        System.out.println(calculatePower(9,6,arr,stre));
    }
    public static int calculatePower(int n,int m,int[][] arr,int[] stre){
        ArrayList<HashSet<Integer>> team = new ArrayList<HashSet<Integer>>();
        for(int i=0; i<m; i++){
            int x = arr[i][0];
            int y = arr[i][1];

            if(team.size()==0){
                HashSet<Integer> hs = new HashSet<Integer>();
                hs.add(x);
                hs.add(y);
                team.add(hs);
            }else{
                int flag = 0;
                for (int j = 0; j < team.size() ; j++) {
                    if (team.get(j).contains(x) && !team.get(j).contains(y)) {
                        team.get(j).add(y);
                       flag = 1;
                        break;
                    } else if (!team.get(j).contains(x) && team.get(j).contains(y)) {
                        team.get(j).add(x);
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    HashSet<Integer> hs = new HashSet<Integer>();
                    hs.add(x);
                    hs.add(y);
                    team.add(hs);
                }


            }
        }
        int[] peo = new int[n];
        int max = 0;
        for (int i = 0; i < team.size() ; i++) {
            int sum = 0;
            for(int a : team.get(i)){
                sum += stre[a-1];
                peo[a-1] = 1;
            }
            max = Math.max(max,sum);
        }
        for (int i = 0; i < n ; i++) {
            if(peo[i] != 1){
                max = Math.max(max,stre[i]);
            }
        }
        return max;
    }
}
