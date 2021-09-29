package problem.chapter01;

import java.util.Scanner;

public class Q1_3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        int min = 0;
        int pos;
        while (str.indexOf(" ") != -1) {
            pos = str.indexOf(" ");
            String x = str.substring(0, pos);
            if (min < x.length()) {
                min = x.length();
                answer = x;

            }
            str = str.substring(pos + 1);
        }
        if (str.length() > min) {
            answer = str;
        }
        return answer;
    }
}
