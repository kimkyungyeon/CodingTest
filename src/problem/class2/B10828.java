package problem.class2;

import java.util.Scanner;
import java.util.Stack;

public class B10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
//            System.out.println("size : "+ st.size());
            String str = sc.next();

            if (str.equals("push")) {
                int val = sc.nextInt();
                st.push(val);
            } else if (str.equals("pop")) {
                if (st.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(st.pop()).append('\n');
                }
            } else if (str.equals("size")) {
                sb.append(st.size()).append('\n');
            } else if (str.equals("empty")) {
                if (st.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (str.equals("top")) {
                if (st.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(st.peek()).append('\n');
                }
            }
//            System.out.println("마무리");
        }
        System.out.println(sb);
    }
}
