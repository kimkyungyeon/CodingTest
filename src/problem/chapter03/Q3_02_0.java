package problem.chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q3_02_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int M = sc.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < M; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        for (int x : solution(N, M, a, b)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                p1++;
            } else if (a[p1] > b[p2]) {
                p2++;
            } else if (a[p1] == b[p2]) {
                ans.add(a[p1]);
                p1++;
                p2++;
            }
        }

        return ans;
    }
}
