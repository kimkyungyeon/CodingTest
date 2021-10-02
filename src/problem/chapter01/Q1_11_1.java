package problem.chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        str = str + " ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) count++;
            else {
                answer += str.charAt(i);
                if (count > 1) answer += count;
                count =1;
            }
        }
        return answer;
    }
}
