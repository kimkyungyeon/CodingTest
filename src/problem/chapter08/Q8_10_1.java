package problem.chapter08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_10_1 {
    static int[][] map, ch;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int[8][8];
        ch = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        map[1][1] = 1;
        Node n = new Node(1, 1);
        dfs(1, 1);
        System.out.println(cnt);
    }

    private static void dfs(int x, int y) {
        if (x == 7 && y == 7) {
            cnt++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    dfs(nx, ny);
                    map[nx][ny] = 0;
                }
            }
        }
    }


}

