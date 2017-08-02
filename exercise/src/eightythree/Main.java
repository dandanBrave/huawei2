package eightythree;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/2.
 *  有一个数据表格为二维数组（数组元素为int类型），行长度为ROW_LENGTH,列长度为COLUMN_LENGTH。
 *  对该表格中数据的操作可以在单个单元内，也可以对一个整行或整列进行操作，操作包括交换两个单元中的数据；
 *  插入某些行或列。请编写程序，实现对表格的各种操作，
 *  并跟踪表格中数据在进行各种操作时，初始数据在表格中位置的变化轨迹。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(row>9||col>9||row<0||col<0){
                System.out.println(-1);
            }else {
                System.out.println(0);
            }
            int ax = sc.nextInt();
            int ay = sc.nextInt();
            int bx = sc.nextInt();
            int by = sc.nextInt();
            if(ax>=row||ay>=col||ax<0||ay<0||bx>=row||by>=col||bx<0||by<0){
                System.out.println(-1);
            }else {
                System.out.println(0);
            }
            int iRow = sc.nextInt();
            if(iRow>=row||iRow<0){
                System.out.println(-1);
            }else {
                System.out.println(0);
            }
            int iCol = sc.nextInt();
            if(iCol>=col||iCol<0){
                System.out.println(-1);
            }else {
                System.out.println(0);
            }
            int rRow = sc.nextInt();
            int rCol = sc.nextInt();
            if(rRow>=row||rCol>=col||rRow<0||rCol<0){
                System.out.println(-1);
            }else {
                System.out.println(0);
            }

        }
    }
}
