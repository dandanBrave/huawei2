package sixteen;

/**
 * Created by Administrator on 2017/7/3.
 * 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。
 * 从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
        String[] inputArr = in.next().split(";", -1);
        int x = 0, y = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].matches("^[ADWS]\\d{1,2}$")) {
                String direction = inputArr[i].substring(0, 1);
                int move = Integer.parseInt(inputArr[i].substring(1));
                if ("A".equals(direction)) {
                    x -= move;
                } else if ("D".equals(direction)) {
                    x += move;
                } else if ("W".equals(direction)) {
                    y += move;
                } else {
                    y -= move;
                }
            }
        }
        System.out.println(x + "," + y);
        }
        in.close();
    }
}