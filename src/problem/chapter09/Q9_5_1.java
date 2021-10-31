package problem.chapter09;

import java.util.Arrays;
import java.util.Scanner;

public class Q9_5_1 {
    static int[] coin;
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        dy = new int[m + 1];

        System.out.println(solution(coin));
        for (int x : dy) {
            System.out.print(x+" ");
        }
    }

    private static int solution(int[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;

        for (int i = 0; i < coin.length; i++) {
            for (int j = coin[i]; j < dy.length; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[dy.length-1];
    }
}
