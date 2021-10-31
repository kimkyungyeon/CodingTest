package problem.chapter08;

import java.util.Scanner;

//순열구하기
public class Q8_6_0 {
    static int n;
    static int m;
    static int[] arr;
    static int[] pm;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pm = new int[m];

        dfs(0);
    }

    private static void dfs(int l) {
        if (l == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    pm[l] = arr[i];
                    ch[i] = 1;
                    dfs(l + 1);
                    ch[i] = 0;

                }
            }
        }
    }
}
