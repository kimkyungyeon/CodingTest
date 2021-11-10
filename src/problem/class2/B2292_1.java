package problem.class2;

import java.util.Scanner;

public class B2292_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    private static int solution(int n) {
        int res = 1;
        if (n == 1) {
            return res ;
        } else {
            int range = 2;
            while (range <= n) {
                range = range + (res * 6);
                res++;
            }

            return res;
        }

    }
}
