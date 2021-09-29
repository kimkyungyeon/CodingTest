package problem.chapter01;

import java.util.Scanner;

public class Q1_6 {
    public static boolean[] map = new boolean[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        for (char x : c) {
            if(map[(x-97)] == false){
                map[(x-97)] = true;
                answer = answer + x;
            }
        }

        return answer;
    }
}
