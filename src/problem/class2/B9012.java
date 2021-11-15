package problem.class2;

import java.util.Scanner;

public class B9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();

            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ')') {
                    sum -= 1;
                } else if(str.charAt(j)=='(') {
                    sum += 1;
                }

                if (sum < 0) {
                    break;
                }
            }

            if (sum < 0) {
                System.out.println("NO");
            } else if (sum == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
