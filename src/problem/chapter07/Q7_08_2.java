package problem.chapter07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q7_08_2 {
    public static int answer = 0;
    public static int[] dis = {1, -1, 5};
    public static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(bfs(s, e));
    }

    private static int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        int l = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {

                int x = q.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) {
                        return l + 1;
                    }

                    if (nx >= 0 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            l++;

        }
        return l;

    }
}
