package problem.chapter02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_8_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }

    }

    private static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    tmp++;
                }
            }
            answer.add(tmp);
        }

        return answer;
    }
}
