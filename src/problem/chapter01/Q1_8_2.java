package problem.chapter01;

import java.util.Scanner;

public class Q1_8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String tmp = str.toUpperCase().replaceAll("[^A-Z]", "");
        if(tmp.equals(new StringBuilder(tmp).reverse().toString())) return "YES";
        else return "NO";
    }
}
