package problem.chapter01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1_4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            str[i] = sc.next();
        }

        for (String x : solution(count, str)) {
            System.out.println(x);
        }
    }

    private static String[] solution(int count, String[] str) {
        String[] answer = new String[count];
        for (int i = 0; i < count; i++) {
            char[] c = str[i].toCharArray();
            int lt = 0;
            int rt = c.length - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            answer[i] = String.valueOf(c);

        }

        return answer;
    }
}
