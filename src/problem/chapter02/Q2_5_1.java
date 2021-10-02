package problem.chapter02;

import java.util.Scanner;

public class Q2_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));

    }

    private static int solution(int n) {
        int count = 0;
        boolean[] map = new boolean[n+1];
        for(int i=2; i<=n; i++){

            if(map[i] == false){
                count++;
                for (int j = i; j <= n; j = j + i) {
                    map[j] = true;
                }
            }
        }


        return count;
    }
}
