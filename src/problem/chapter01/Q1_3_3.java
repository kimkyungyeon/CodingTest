package problem.chapter01;

import java.util.Scanner;

public class Q1_3_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String ans = "";
        int m = 0;
        String[] arr = str.split(" ");
        for(String x : arr){
            if(x.length() > m){
                m = x.length();
                ans = x;
            }
        }
        return ans;
    }
}
