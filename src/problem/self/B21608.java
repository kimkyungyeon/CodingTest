package problem.self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//상어 초등학교 실버(1) 구현
public class B21608 {
    static int n;
    static int[][] map, ch;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Map<Integer, ArrayList<Integer>> p;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        map = new int[n + 1][n + 1];
        ch = new int[n + 1][n + 1];

        Map<Integer, ArrayList<Integer>> p = new HashMap<>();

        for (int i = 0; i < n * n; i++) {
            int s = sc.nextInt();
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            int d = sc.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(sc.nextInt());
            arr.add(sc.nextInt());
            arr.add(sc.nextInt());
            arr.add(sc.nextInt());
            p.put(s, arr);

        }

        solution(0,p, map, ch);
    }

    private static int getLikeCnt(int x, int y, Map<Integer, ArrayList<Integer>> p) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 1 && ny >= 1 && nx <= n && ny <= n) {

            }
        }
        return 0;
    }

    private static int getEmptyCnt(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx>=1 && ny>=1 && nx<=n && ny<=n && map[nx][ny] == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    private static void solution(int l, Map<Integer, ArrayList<Integer>> p, int[][] map, int[][] ch) {
        if (l == p.size()) {

        } else {
            for (int i = 0; i < p.size(); i++) {

            }
        }
    }


}
