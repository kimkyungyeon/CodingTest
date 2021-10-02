package problem.chapter02;

import java.util.Scanner;

public class Q2_4_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int n) {
        int[] answer = new int[n];
        int tmp =0;
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = tmp + answer[i - 1];
            tmp = answer[i-1];
        }

        return answer;
    }
}
