package problem.chapter02;

import java.util.Scanner;

public class Q2_10_0 {
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isBong = true;

                for (int k = 0; k < 4; k++) {
                    int xi = i + dx[k];
                    int xj = j + dy[k];

                    if (xi >= 0 && xj >= 0 && xi < n && xj < n) {
                        if (arr[i][j] <= arr[xi][xj]) {
                            isBong = false;
                            break;
                        }

                    }
                }
                if (isBong) {
                    System.out.println(arr[i][j]);
                    answer++;
                }
            }
        }

        return answer;
    }
}
