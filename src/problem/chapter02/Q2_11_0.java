package problem.chapter02;

import java.util.Scanner;

public class Q2_11_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        int[] tmp = new int[n];
        int temp =0;
        int cnt;

        for (int i = 1; i < n + 1; i++) {
            cnt = 0;
            for (int j = 1; j < n + 1; j++) {

                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }

                }

            }
            if (cnt > temp) {
                temp = cnt;
                answer = i;
            }
        }


        return answer;
    }
}
