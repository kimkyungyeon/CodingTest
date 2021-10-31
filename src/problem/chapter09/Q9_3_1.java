package problem.chapter09;

import java.util.Scanner;

public class Q9_3_1 {
    static int n;
    static int[] arr;
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        dy = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int answer = 0;
        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i-1; j>=0; j--) {
                if (arr[i] > arr[j] && dy[j] > max) {
                    max = dy[j];
                }
                dy[i] = max + 1;
                answer = Math.max(answer, dy[i]);
            }
        }
        return answer;
    }
}
