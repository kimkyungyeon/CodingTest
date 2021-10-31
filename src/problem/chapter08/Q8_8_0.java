package problem.chapter08;

import java.util.Scanner;

public class Q8_8_0 {
    static int n;
    static int f;
    static int[] b, p, ch;
    static boolean flag = false;
    static int[][] dy= new int[35][35];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b= new int[n];
        p = new int[n];
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n-1,i);
        }
        dfs(0, 0);
    }

    private static int combi(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else{
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    private static void dfs(int l, int sum) {
        if (flag == true) {
            return;
        }
        if (l == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x +" ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[l] = i;
                    dfs(l + 1, sum + (p[l] * b[l]));
                    ch[i] = 0;
                }
            }
        }
    }
}
