package problem.chapter01;

import java.util.Scanner;

public class Q1_3_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        int min = 0;
        String[] s = str.split(" ");
        for (String x : s) {
            if (min < x.length()) {
                min = x.length();
                answer = x;
            }
        }

        return answer;
    }
}
