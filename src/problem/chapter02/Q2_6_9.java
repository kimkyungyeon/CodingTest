package problem.chapter02;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_6_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

    private static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    System.out.println(i);
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    answer.add(i);
                }
        }

        return answer;
    }
}
