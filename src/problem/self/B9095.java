package problem.self;

import java.util.Scanner;

public class B9095 {
    static int n;
    static int[] coin = {1, 2, 3};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            solution(0, 0, arr[i]);
        }
    }

    private static void solution(int cnt, int sum, int goal) {
        int answer =0;
        if (sum == goal) {
            answer++;
            System.out.println(cnt);
        } else {
            for (int i = 0; i < 3; i++) {
                solution(cnt + 1, sum + coin[i], goal);
            }
        }
    }
}
