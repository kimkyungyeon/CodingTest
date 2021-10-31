package problem.chapter07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단거리BFS
public class Q7_14_3 {
    static int n, m, answer = 0;
    static int[] dis, ch;
    static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        dis = new int[n + 1];
        ch = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int cv = q.poll();
                dis[cv] = l;
                for (int j = 1; j <= n; j++) {

                    if (ch[j] == 0 && graph[cv][j] == 1) {
                        ch[j] = 1;
                        q.offer(j);
                    }
                }
            }
            l++;
        }
    }
}
