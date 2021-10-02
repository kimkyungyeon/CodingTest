package problem.chapter02;

import java.util.Scanner;

public class Q2_2_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));

    }

    private static int solution(int n, int[] arr) {
        int answer = 0;
        int tmp = 0;

        for (int x : arr) {
            if(x>tmp) {
                answer++;
                tmp = x;
            }
        }

        return answer;
    }
}
