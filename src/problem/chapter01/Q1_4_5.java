package problem.chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] str = new String[count];
        for (int i = 0; i < count; i++) {
            str[i] = sc.next();
        }

        for (String x : solution(count, str)) {
            System.out.println(x);
        }
    }

    private static ArrayList<String> solution(int count, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
}
