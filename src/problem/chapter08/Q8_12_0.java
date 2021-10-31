package problem.chapter08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_12_0 {
    static int m, n;
    static int[][] box, ch;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        box = new int[n][m];
        ch = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    q.offer(new Node(i, j));
                }
            }
        }
        int answer = Integer.MIN_VALUE;

        bfs();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, ch[i][j]);
                }
            }
            System.out.println(answer);

        } else {
            System.out.println(-1);
        }


    }

    private static void bfs() {
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && box[nx][ny] == 0) {
                    box[nx][ny] = 1;
                    ch[nx][ny] = ch[cur.x][cur.y] + 1;
                    q.offer(new Node(nx, ny));

                }

            }
        }

    }

}
