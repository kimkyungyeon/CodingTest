package problem.chapter08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q8_11_0 {
    static int[][] map, ch;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

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

        bfs();
        if (ch[7][7] == 0) {
            System.out.println(-1);
        } else {

            System.out.println(ch[7][7]);
        }
    }

    private static void bfs() {
        int count = 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(1, 1));
        while (!q.isEmpty()) {

            Node cur = q.poll();
            for (int j = 0; j < 4; j++) {
                int x = cur.x + dx[j];
                int y = cur.y + dy[j];
                if (x >= 1 && y >= 1 && x <= 7 && y <= 7 && map[x][y] == 0) {
                    map[x][y] = 1;
                    q.offer(new Node(x, y));
                    ch[x][y] = ch[cur.x][cur.y] + 1;
                }
            }

        }

    }
}

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
