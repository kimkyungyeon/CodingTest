package problem.chapter08;

import java.util.ArrayList;
import java.util.Scanner;

public class Q8_15_0 {
    static int n;
    static int m;
    static int len;
    static int answer = Integer.MAX_VALUE;
    static int[] combi;
    static int[][] arr;
    static ArrayList<Poin> hs, pz;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n+1][n+1];
        hs = new ArrayList<>();
        pz = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    hs.add(new Poin(i, j));
                } else if (arr[i][j] == 2) {
                    pz.add(new Poin(i, j));
                }
            }
        }

        len = pz.size();
        combi = new int[m];
        dfs(0, 0);
        System.out.println(answer);
        

    }

    private static void dfs(int l, int s) {
        if (l == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();

            int sum = 0;
            for (Poin h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(sum, answer);
            System.out.println(answer);
        } else {
            for (int i = s; i < len; i++) {
                combi[l] = i;
                dfs(l + 1, i + 1);

            }
        }
    }
}

class Poin{
    int x;
    int y;

    public Poin(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
