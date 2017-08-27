import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GuessSecert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lockingKey = sc.nextInt();
        if (lockingKey < -100000 && lockingKey > 100000) {
            return;
        }

        boolean isPlus = lockingKey >= 0;

        lockingKey = Math.abs(lockingKey);

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (lockingKey >= 10) {
            int num = lockingKey % 10;
            lockingKey = lockingKey / 10;
            list.add(num);
        }
        list.add(lockingKey);

        if (isPlus) {
            Collections.sort(list, new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });

            int index = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    index = i;
                    break;
                }
            }
            if (index > 0) {
                Integer temp = list.get(0);
                Integer temp2 = list.get(index);
                list.set(0, temp2);
                list.set(index, temp);
            }
        } else {
            Collections.sort(list, new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
        }

        int key = 0;
        for (int i = 0, len = list.size(); i < len; i++) {
            key = (int) (key + list.get(len - i - 1) * Math.pow(10, i));
        }
        if (!isPlus) {
            key = -key;
        }
        System.out.println("key:" + key);
    }

}
