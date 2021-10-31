package problem.chapter07;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 최단거리BFS
public class Q7_14_1 {
    static int n, m, answer = 0;
    static int[] dis, ch;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<>();
        dis = new int[n + 1];
        ch = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] =1;
        dis[v] = 0;
        q.offer(v);
        while (!q.isEmpty()) {
            int cv = q.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
}
