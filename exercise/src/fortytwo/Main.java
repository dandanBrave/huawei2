package fortytwo;

/**
 * Created by Administrator on 2017/7/5.
 * Jessi初学英语，为了快速读出一串数字，编写程序将数字转换成英文：
 * 如22：twenty two，123：one hundred and twenty three。
 说明：
 数字为正整数，长度不超过九位，不考虑小数，转化结果为英文小写；
 输出格式为twenty two；
 非法数据请返回“error”；
 关键字提示：and，billion，million，thousand，hundred。
 方法原型：public static String parse(long num)
 输入描述:
 输入一个long型整数
 输出描述:
 输出相应的英文写法
 */
import java.util.Scanner;
public class Main{
        public static String[] num1 = {"zero", "one", "two", "three", "four"
                , "five", "six", "seven", "eight", "nine"};
        public static String[] num2 = {"ten","eleven","twelve","thirteen","fourteen"
                ,"fifteen","sixteen","seventeen","eighteen","nighteen"};
        public static String[] num3 = {"twenty","thirty","forty","fifty"
                ,"sixty","seventy","eighty","ninety"};
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long num = 0;
            while(sc.hasNext()){
                num = sc.nextLong();
                System.out.println(parse(num));
            }
        }
        public static String parse(long num){
            if(num < 0 )
                return "error";
            StringBuilder sb = new StringBuilder();
            long billion = num / 1000000000;
            //十亿部分
            if(billion != 0){
            sb.append(thranslate(billion) + " billion ");//翻译十亿部分
            }
            num = num % 1000000000;
        //百万部分
            long million = num / 1000000;
            if(million != 0){
                sb.append(thranslate(million) + " million ");//翻译百万部分
            }
            num = num % 1000000;
       //千部分
            long thousand = num / 1000;
            if(thousand != 0){
                sb.append(thranslate(thousand) + " thousand ");//翻译千部分
            }
        //百部分
            num = num % 1000;
            if(num != 0){
                sb.append(thranslate(num));//翻译百部分

            }
            return sb.toString().trim();//别忘了去除字符串后面的空格
        }

       //翻译方法
       public static String thranslate(long num){
       StringBuilder sb = new StringBuilder();
        //百位处理
       long h = num / 100;
       if(h != 0){
        //若不为0，翻译，否则不翻译
       sb.append(num1[(int) h] + " hundred");
       }
      num = num % 100;
       //十位部分
      long k = num / 10;
     if(k != 0){
        if(h != 0)//如果有百位别忘了加and
        sb.append(" and ");
     if(k == 1){//若十位为1，连同个位一起翻译
        long t = num % 10;
        sb.append(num2[(int)t]);
       }
       else{//否则，十位和个位分别单独翻译
        sb.append(num3[(int)k - 2] + " ");
       if(num % 10 != 0)
       sb.append(num1[(int)(num % 10)]);
       }
   }
        else if(num % 10 != 0){//如果没有十位部分，直接翻译个位部分
         if(h != 0)
        sb.append(" and ");
    sb.append(num1[(int)(num % 10)]);
       }
       return sb.toString().trim();//别忘了去除字符串后面的空格
        }
        }