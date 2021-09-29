package problem.chapter01;

import java.util.Scanner;

public class Q1_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String ans = "";
        int min = 0;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if(len>min){
                min = len;
                ans = x;
            }
        }
        return ans;
    }
}
