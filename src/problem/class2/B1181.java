package problem.class2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLine();
        }

        solution(n, list);
    }

    private static void solution(int n, String[] list) {
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        for (String x : list) {
            System.out.println("x = " + x);
        }

        System.out.println(list[0]);
        for (int i = 1; i < n; i++) {
            if (!list[i].equals(list[i - 1])) {
                System.out.println(list[i]);
            }
        }

    }
}
