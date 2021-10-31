package problem.chapter08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//중복순열 구하기
public class Q8_4_0 {
    static int n;
    static int m;
    static ArrayList<Integer> arr;
    static int[] map;
    static int[] pm;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        pm = new int[m];
        arr = new ArrayList<>();
        dfs(0);
    }

    private static void dfs(int l) {

        if (l == m) {
            for (int n : pm) {
                System.out.print(n + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i=1; i<=n; i++) {
                pm[l] = i;
                dfs(l+1);

            }
        }
    }
}
