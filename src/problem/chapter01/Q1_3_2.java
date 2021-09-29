package problem.chapter01;

import java.util.Scanner;

public class Q1_3_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String ans = "";
        int min = 0;
        int pos;
        while ( (pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>min){
                min = len;
                ans = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>min){
            ans = str;
        }

        return ans;
    }
}
