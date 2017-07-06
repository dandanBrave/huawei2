package onehundredandone;

/**
 * Created by Administrator on 2017/7/5.
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            Integer[] array = new Integer[n];
            for (int i = 0; i < n ; i++){
                array[i] = sc.nextInt();
            }
            int flag = sc.nextInt();      //0表示升序，1表示降序
            sortIntegerArray(array,flag);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
        }
    }
    public static void sortIntegerArray(Integer[] pIntegerArray, int iSortFlag){
        int temp = 0;
        if(iSortFlag==0){     //0表示升序
            for (int i = 0; i < pIntegerArray.length-1 ; i++) {
                for (int j = 0; j < pIntegerArray.length-1-i ; j++) {
                    if(pIntegerArray[j]>pIntegerArray[j+1]){
                        temp = pIntegerArray[j];
                        pIntegerArray[j] = pIntegerArray[j+1];
                        pIntegerArray[j+1] = temp;
                    }
                }
            }
        }else if(iSortFlag==1){   //1表示降序
            for (int i = 0; i < pIntegerArray.length-1 ; i++) {
                for (int j = 0; j < pIntegerArray.length-1-i ; j++) {
                    if(pIntegerArray[j]<pIntegerArray[j+1]){
                        temp = pIntegerArray[j];
                        pIntegerArray[j] = pIntegerArray[j+1];
                        pIntegerArray[j+1] = temp;
                    }
                }
            }
        }
    }
}
