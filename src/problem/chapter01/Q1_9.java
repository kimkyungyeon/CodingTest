package problem.chapter01;

import java.util.Scanner;

public class Q1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        int answer = 0;
        String tmp = str.replaceAll("[^0-9]", "");
        answer = Integer.parseInt(tmp);

        return tmp;
    }
}
