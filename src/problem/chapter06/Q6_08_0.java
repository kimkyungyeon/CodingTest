package problem.chapter06;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_08_0 {
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
        int answer=0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = n - 1;
        int count = 0;
        while (lt<=rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid -1;
            } else if (arr[mid] < m) {
                lt = mid +1;
            }
        }
        return answer;
    }
}
