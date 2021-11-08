package problem.class2;

import java.util.Scanner;

public class B15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        long answer = 0;
        for (int i = 0; i < L; i++) {
            long j = str.charAt(i) - 'a' + 1;
            for (int k = 0; k < i; k++) {
                j *= 31;
                j %= 1234567891;
            }
            answer += j;
            answer %= 1234567891;
        }



        System.out.println(answer);
    }
}
