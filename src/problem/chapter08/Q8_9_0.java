package problem.chapter08;

import java.util.Scanner;

public class Q8_9_0 {
    static int n, m;
    static int[] pm;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        dfs(0, 1);
    }

    private static void dfs(int l, int s) {
        if (l == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                pm[l] = i;
                dfs(l + 1, i + 1);
            }
        }
    }
}
