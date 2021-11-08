package problem.chapter06;

import java.util.Scanner;

public class Q6_04_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(S, N, arr)) {
            System.out.print(x + " ");
        }
    }

    private static int[] solution(int s, int n, int[] arr) {
        int[] c = new int[s];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < s; i++) {
                if (c[i] == x) pos = i;
            }

            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    c[i] = c[i - 1];
                }
                c[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    c[i] = c[i - 1];
                }
                c[0] = x;
            }
        }
        return c;
    }
}
