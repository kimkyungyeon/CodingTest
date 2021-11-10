package problem.self;

import java.util.ArrayList;
import java.util.Scanner;

//N과M 수열구하기
public class B15649 {
    static int N;
    static int M;
    static int[] pm;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pm = new int[M];
        ch = new int[N + 1];
        solution(0);
    }

    private static void solution(int l) {
        if (l == M) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[l] = i;
                    solution(l + 1);
                    ch[i] = 0;
                }
            }
        }
    }
}
