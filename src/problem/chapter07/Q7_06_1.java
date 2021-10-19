package problem.chapter07;

import java.util.Arrays;

//부분집합 구하기 DFS
public class Q7_06_1 {
    static int n;
    static int[] ch;

    public static void dfs(int l) {
        if (l == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += i+ " ";
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
            return;
        } else {
            ch[l] = 1;
            dfs(l + 1);
            ch[l] = 0;
            dfs(l + 1);
        }

    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n + 1];
        dfs(1);
    }
}
