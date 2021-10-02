package problem.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2_6_0 {
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
        String[] tmp1 = new String[n];
        int[] tmp2 = new int[n];

        for (int i = 0; i < n; i++) {
            tmp2[i] = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
        }

        for (int i = 0; i < n; i++) {
            boolean isPrime = true;

            if (tmp2[i] >= 2) {
                for (int j = 2; j < tmp2[i]; j++) {
                    if (tmp2[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    answer.add(tmp2[i]);
                }
            }
        }


        return answer;
    }

}
