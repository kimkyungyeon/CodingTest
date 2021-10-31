package problem.chapter08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_14_0 {
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
                    map[i][j] =0;
                    bfs(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        while (!q.isEmpty()) {
            Point cur = q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];

                if (nx >= 0 && ny >= 0 && ny < n && nx < n && map[nx][ny] == 1) {
                    map[nx][ny] =0;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

}
class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
