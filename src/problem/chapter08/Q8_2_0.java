package problem.chapter08;

import java.util.Scanner;

//바둑이 승차(dfs)
public class Q8_2_0 {
    static int c, n;
    static int[] w;
    static int m = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        dfs(0, 0);
        System.out.println(m);
    }

    private static void dfs(int l, int sum) {

        if (sum > c) return;
        if (l == n) {
            m = Math.max(m, sum);
            return;
        } else {
            dfs(l + 1, sum + w[l]);
            dfs(l + 1, sum);
        }
    }
}
