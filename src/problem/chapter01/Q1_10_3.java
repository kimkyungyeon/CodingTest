package problem.chapter01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q1_10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int n : solution(str, c)) {
            System.out.print(n + " ");
        }
    }

    private static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i=0; i<str.length(); i++) {
            p++;
            if(str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            p++;
            if(str.charAt(i) == c){
                p=0;
            }else {
                answer[i] = Math.min(p, answer[i]);
            }
        }


        return answer;
    }
}
