package problem.chapter02;

import java.util.Scanner;

public class Q2_5_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        boolean[] arr = new boolean[n + 1];
        int count = 0;

        //에라토스테네스 체
        for (int i = 2; i <= n; i++) {
            if (arr[i] == false) {
                count++;
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = true;
                }
            }

        }


        return count;
    }
}
