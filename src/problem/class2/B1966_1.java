package problem.class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1966_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for (int i = 0; i < A; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[N];
            Queue<Text> q = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            

            int ch = 0;
            int cnt = 1;
            for (int j = 0; j < N; j++) {
                if (arr[M] < arr[j]) {
                    ch=1;
                    cnt++;
                }
                if (arr[M] == arr[j] && ch == 1) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}


