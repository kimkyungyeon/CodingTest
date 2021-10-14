package problem.chapter02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q2_6_2 {
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
        ArrayList<Integer> ans = new ArrayList<>();
        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
        }

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            if (tmp[i] >= 2) {
                for (int j = 2; j < tmp[i] - 1; j++) {
                    if(tmp[i]%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    ans.add(tmp[i]);
                }


            }
        }

        return ans;
    }
}
