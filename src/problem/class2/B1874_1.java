package problem.class2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class B1874_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> array = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            array.add("+");

            while (!stack.isEmpty()) {
                if (stack.peek() == arr[count]) {
                    stack.pop();
                    array.add("-");
                    count++;
                } else {
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
        } else {

            for (String s : array) {
                System.out.println(s);
            }
        }

    }
}
