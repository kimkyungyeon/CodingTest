package problem.chapter01;

import java.util.Scanner;

public class Q1_12_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(str, n));
    }

    private static String solution(String str, int n) {
        String answer = "";
        str = str.replace("#", "1").replace("*","0");
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7);
            answer += (char)Integer.parseInt(tmp, 2);

            str = str.substring(7);
        }

        return answer;
    }
}
