package problem.chapter03;

import java.util.Scanner;

public class Q3_03_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(N, K, arr));

    }

    private static int solution(int n, int k, int[] arr) {
        int answer =0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
