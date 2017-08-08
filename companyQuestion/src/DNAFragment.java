import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/8.
 * 牛牛从生物科研工作者那里获得一段字符串数据s,牛牛需要帮助科研工作者从中找出最长的DNA序列。
 * DNA序列指的是序列中只包括'A','T','C','G'。牛牛觉得这个问题太简单了,就把问题交给你来解决。
 * 例如: s = "ABCBOATER"中包含最长的DNA片段是"AT",所以最长的长度是2。
 */
/*
本题的主要思路在于需要两个数来计算最长的DNA序列，用index来记录字符串中每个位置字母累积的数量，而sum表示累积的个数，
当遇到不是A，G，C，T的时候，index从零开始重新计数，当index大于sum的时候，更新sum的数值
 */
public class DNAFragment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.next();
            int len = str.length();
            if(len<1||len>50){
                return;
            }
            int index = 0;
            int sum = 0;
            for (int i = 0; i < len; i++) {
                char c = str.charAt(i);
                if(c=='A'||c=='T'||c=='C'||c=='G'){
                    index++;
                    if(index>sum){
                        sum = index;
                    }
                }else{
                    index = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
