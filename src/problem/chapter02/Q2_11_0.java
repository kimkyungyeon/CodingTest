package problem.chapter02;

import java.util.Scanner;

public class Q2_11_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        int[] tmp = new int[n];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {

            }
        }


        return answer;
    }
}
