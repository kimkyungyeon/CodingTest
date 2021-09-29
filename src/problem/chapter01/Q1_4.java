package problem.chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_4 {
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

    private static String[] solution(int n, String[] str) {
        String[] answer = new String[n];
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        for (int i = 0; i < n; i++) {
            String tmp = new StringBuilder(str[i]).reverse().toString();
            answer[i] = tmp;
        }

        return answer;
    }
}
