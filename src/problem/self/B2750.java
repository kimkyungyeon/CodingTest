package problem.self;

import java.util.Arrays;
import java.util.Scanner;

public class B2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(N, arr)) {
            System.out.println(x+" ");
        }
    }

    private static int[] solution(int n, int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
