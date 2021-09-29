package problem.chapter01;

import java.util.Scanner;

public class Q1_7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String tmp = str.toLowerCase();
        if( tmp.equals(new StringBuilder(tmp).reverse().toString())) return "YES";


        return "NO";
    }
}
