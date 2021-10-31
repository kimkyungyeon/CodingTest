package problem.chapter08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//동전교환
public class Q8_5_0 {
    static int n;
    static int m;
    static int min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        min = Integer.MAX_VALUE;

        dfs(0, 0, arr);
        System.out.println(min);
    }

    private static void dfs(int l, int sum, Integer[] arr) {
        if (sum > m) return;
        if (l >= min) return;
        if (sum == m) {
            min = Math.min(l, min);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(l + 1, sum+arr[i], arr);
            }
        }
    }
}
