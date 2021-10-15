package problem.chapter02;

import java.util.Scanner;

public class Q2_12_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m+1][n+1];

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, m, arr));
    }

    private static int solution(int n, int m, int[][] arr) {
        int answer = 0;
        int pi =0;
        int pj =0;
        int cnt;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                cnt = 0;


                for (int k = 1; k < m + 1; k++) {
                    for (int s = 1; s < n + 1; s++) {
                        if (arr[k][s] == i) {
                            pi = s;
                        }
                        if (arr[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }

                if (cnt == m) {
                    answer++;
                }
            }
        }


        return answer;
    }
}
