package problem.chapter03;

import java.util.Scanner;

//연속부분 수열
public class Q3_04_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, M, arr));
    }

    private static int solution(int n, int m, int[] arr) {
        int ans = 0;
        int lt = 0;
        int rt = 0;
        while (rt < n) {
            int sum = 0;
            for (int i = lt; i <= rt; i++) {
                sum += arr[i];
            }

            if (sum == m) {
                ans++;
                rt++;
                lt++;
            } else if (sum < m) {
                rt++;
            } else if (sum > m) {
                lt++;
            }
        }
        return ans;
    }
}
