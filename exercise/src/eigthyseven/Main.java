package eigthyseven;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/8/6.
 * 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
 一、密码长度:
 5 分: 小于等于4 个字符
 10 分: 5 到7 字符
 25 分: 大于等于8 个字符
 二、字母:
 0 分: 没有字母
 10 分: 全都是小（大）写字母
 20 分: 大小写混合字母
 三、数字:
 0 分: 没有数字
 10 分: 1 个数字
 20 分: 大于1 个数字
 四、符号:
 0 分: 没有符号
 10 分: 1 个符号
 25 分: 大于1 个符号
 五、奖励:
 2 分: 字母和数字
 3 分: 字母、数字和符号
 5 分: 大小写字母、数字和符号
 最后的评分标准:
 >= 90: 非常安全
 >= 80: 安全（Secure）
 >= 70: 非常强
 >= 60: 强（Strong）
 >= 50: 一般（Average）
 >= 25: 弱（Weak）
 >= 0:  非常弱
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(GetPwdSecurityLevel(str));

        }
    }
    public static String  GetPwdSecurityLevel(String pPasswordStr) {
     /*在这里实现功能*/
        int score = 0;
        int len = pPasswordStr.length();

        //1. 判断密码长度
        if (0 < len && len <= 4) {
            score += 5;
        } else if (5 <= len && len <= 7) {
            score += 10;
        } else if (len >= 8) {
            score += 25;
        }

        //2. 判断字母
        int lowNum = 0;
        int uppNum = 0;
        for (int i = 0; i < len; i++) {
            int pNum = (int) pPasswordStr.charAt(i);
            if (65 <= pNum && pNum <= 90) {
                uppNum++;
            }
            if (97 <= pNum && pNum <= 122) {
                lowNum++;
            }
        }
        if (lowNum == 0 && uppNum == 0) {
            score += 0;
        } else if ((lowNum > 0 && uppNum == 0) || (lowNum == 0 && uppNum > 0)) {
            score += 10;
        } else if (lowNum > 0 && uppNum > 0) {
            score += 20;
        }

        //3.判断数字
        int sumNum = 0;
        for (int i = 0; i < len; i++) {
            int pNum = pPasswordStr.charAt(i);
            if ('0' <= pNum && pNum <= '9') {
                sumNum++;
            }
        }
        if (sumNum == 0) {
            score += 0;
        } else if (sumNum == 1) {
            score += 10;
        } else if (sumNum > 1) {
            score += 20;
        }

        //4.判断符号
        int sumSym = 0;
        for (int i = 0; i < len; i++) {
            int pNum = (int) pPasswordStr.charAt(i);
            if ((33 <= pNum && pNum <= 47) || (58 <= pNum && pNum <= 64) || (91 <= pNum && pNum <= 96) || (123 <= pNum && pNum <= 126)) {
                sumSym++;
            }
        }
        if (sumSym == 0) {
            score += 0;
        } else if (sumSym == 1) {
            score += 10;
        } else if (sumSym > 1) {
            score += 25;
        }

        //5.奖励分数
        if ((lowNum > 0 && uppNum == 0) || (uppNum > 0 && lowNum == 0) && sumNum > 0 && sumSym == 0) {
            score += 2;
        } else if ((lowNum > 0 && uppNum == 0) || (uppNum > 0 && lowNum == 0) && sumNum > 0 && sumSym > 0) {
            score += 3;
        } else if (lowNum > 0 && uppNum > 0 && sumNum > 0 && sumSym > 0) {
            score += 5;
        }

        if (score >= 90) {
            return "VERY_SECURE";
        } else if (score >= 80) {
            return "SECURE";
        } else if (score >= 70) {
            return "VERY_STRONG";
        } else if (score >= 60) {
            return "STRONG";
        } else if (score >= 50) {
            return "AVERAGE";
        } else if (score >= 25) {
            return "WEAK";
        } else if (score >= 0) {
            return "VERY_WEAK";
        }
        return "WRONG";
    }
}
