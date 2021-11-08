package problem.chapter06;

import java.util.Scanner;

public class Q6_01_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(N, arr)) {
            System.out.print(x+ " ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;

        }
        return arr;
    }
}
