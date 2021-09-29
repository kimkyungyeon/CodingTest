package problem.chapter01;

import java.util.Scanner;

public class Q1_7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        String tmp = str.toLowerCase();
        for (int i = 0; i < tmp.length() / 2; i++) {
            if(tmp.charAt(i) != tmp.charAt(tmp.length()-i-1)) return "NO";
        }


        return "YES";
    }
}
