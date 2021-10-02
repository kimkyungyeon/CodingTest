package problem.chapter02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_3_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (char a : solution(n, A, B)) {
            System.out.println(a);
        }
    }

    private static ArrayList<Character> solution(int n, int[] a, int[] b) {
        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] - b[i] == 1) {
                answer.add('A');
            } else if (a[i] - b[i] == 2) {
                answer.add('B');
            } else if (b[i] - a[i] == 1) {
                answer.add('B');
            } else if (b[i] - a[i] == 2) {
                answer.add('A');
            } else {
                answer.add('D');
            }
        }

        return answer;
    }
}
