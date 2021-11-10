package problem.class2;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class B2292_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(solution(N));
    }

    private static int solution(int n) {
        int res = 1;
        int cur = 0;
        int total = 1;
        while (true) {
            if (n <= total) {
                break;
            } else {
                cur += 6;
                total += cur;
                res++;
            }
        }

        return res;
    }

}
