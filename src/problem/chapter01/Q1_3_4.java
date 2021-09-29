package problem.chapter01;

import java.util.Scanner;

public class Q1_3_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String ans = "";
        int m = 0;
        int pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            if (tmp.length() > m) {
                m = tmp.length();
                ans = tmp;

            }
            str = str.substring(pos + 1);
        }

        if (str.length() > m) ans = str;

        return ans;
    }
}
