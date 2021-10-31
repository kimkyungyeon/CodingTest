package problem.chapter09;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_5_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] dy = new int[m+1];
        Arrays.fill(dy, Integer.MAX_VALUE);

        System.out.println(solution(n, arr, m, dy));
    }

    private static int solution(int n, int[] arr, int m, int[] dy) {
        dy[0] = 0;
        for (int i = 0; i < n; i++) {

            for (int j = arr[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }
        return dy[m];
    }
}
