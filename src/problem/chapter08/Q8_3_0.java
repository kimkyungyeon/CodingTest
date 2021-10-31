package problem.chapter08;

import java.util.Scanner;

//최대점수 구하기 (dfs)
public class Q8_3_0 {
    static int n, m;
    static prob[] arr;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new prob[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new prob(sc.nextInt(), sc.nextInt());
        }

        dfs(0, 0, 0);
        System.out.println(max);
    }

    public static void dfs(int l, int sum, int tt) {
        if(tt> m) return;
        if (l == n) {
            max = Math.max(sum, max);
        } else {
            dfs(l+1, sum+arr[l].jum ,tt+arr[l].time);
            dfs(l + 1, sum, tt);
        }
    }
}

class prob {
    int jum;
    int time;

    public prob(int jum, int time) {
        this.jum = jum;
        this.time = time;
    }

    public int getJum() {
        return jum;
    }

    public void setJum(int jum) {
        this.jum = jum;
    }
}