package problem.class2;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        System.out.println(solution(N, arr));
    }

    private static int solution(int n, int[] arr) {
        arr[1] = 1;
        int x = 6;
        int res = 2;
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            cnt++;
            if (cnt <= x) {
                arr[i] = res;
            }
            if (x == cnt) {
                x = x + 6;
                res++;
                cnt = 0;
            }
        }


        return arr[n];
    }
}
