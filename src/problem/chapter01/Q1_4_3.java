package problem.chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String x : solution(n, str)) {
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            //x를 문자 배열로 생성
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = s.length - 1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }
}
