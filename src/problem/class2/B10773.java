package problem.class2;

import java.util.Scanner;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                st.pop();
            } else {
                st.push(n);
            }
        }
        int res = 0;
        for (int x : st) {
            res += x;
        }
        System.out.println(res);
    }
}
