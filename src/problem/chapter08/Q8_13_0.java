package problem.chapter08;

import java.util.Scanner;

public class Q8_13_0 {
    static int n, count;
    static int[][] map,ch;
    static int[] dx = {-1, 1, 0, 0,-1,1,1,-1};
    static int[] dy = {0, 0, -1, 1,-1,1,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        ch = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ch[i][j] == 0 && map[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs(int x, int y) {


            for (int i = 0; i < 8; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];

                if (nx >= 0 && ny >= 0 && ny < n && nx < n && map[nx][ny] == 1 && ch[nx][ny] == 0) {

                    ch[nx][ny] = 1;
                    dfs(nx, ny);
                }
            }
    }

}
