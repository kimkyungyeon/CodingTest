package problem.chapter08;

import java.util.Scanner;

public class Q8_7_0 {
    static int n;
    static int r;
    static int[][] dy = new int[35][35];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();

        System.out.println(dfs(n,r));

    }

    private static int dfs(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0)  return 1;
        else {
            return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
}
