package problem.chapter01;

import java.util.Scanner;

public class Q1_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        char[] c = str.toCharArray();
        for (char x : c) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x-48);
            }
        }

        return answer;
    }
}
