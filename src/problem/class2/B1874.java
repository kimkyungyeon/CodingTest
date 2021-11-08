package problem.class2;

import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            System.out.println("+");
            while (stack.peek() == arr[count]) {
                stack.pop();
                System.out.println("-");
                count++;
                if (stack.isEmpty()) {
                    break;
                }
            }
        }

    }
}
