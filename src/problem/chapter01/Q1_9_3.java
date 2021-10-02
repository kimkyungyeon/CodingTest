package problem.chapter01;

import java.util.Scanner;

public class Q1_9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        String answer ="";
        char[] c = str.toCharArray();
        for (char x : c) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }
}
