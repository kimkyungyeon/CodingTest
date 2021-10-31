package problem.self;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class B4673 {
    static int[] ch = new int[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10000; i++) {
            if (solution(i) <= 10000) {
                ch[solution(i)] = 1;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (ch[i] == 0) {
                System.out.println(i);
            }
        }
    }

    private static int solution(int i) {
        int tmp = 0;
        tmp += i;

        char[] charArr = String.valueOf(i).toCharArray();
        for (char x : charArr) {
            tmp += x-48;
        }
        return tmp;
    }
}
