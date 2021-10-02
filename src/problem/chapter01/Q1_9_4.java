package problem.chapter01;

import java.util.Scanner;

public class Q1_9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                answer += str.charAt(i);
            }
        }

        return Integer.parseInt(answer);
    }
}
