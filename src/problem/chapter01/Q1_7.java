package problem.chapter01;

import java.util.Locale;
import java.util.Scanner;

public class Q1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        String tmp = str.toLowerCase();
        int lt = 0;
        int rt = tmp.length() - 1;
        while (lt < rt) {
            if(tmp.charAt(lt) != tmp.charAt(rt)) return "NO";
            else {
               lt++;
               rt--;
            }
        }


        return "YES";
    }
}
