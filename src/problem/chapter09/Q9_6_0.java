package problem.chapter09;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9_6_0 {
    static int n;
    static int m;
    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int ps = sc.nextInt();
            int pt = sc.nextInt();

            for (int j = m; j >= pt; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);

            }
        }
        System.out.println(dy[m]);

    }

}

