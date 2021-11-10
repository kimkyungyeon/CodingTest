package problem.self;

import java.util.Scanner;

//덩치 브루트포스
public class B7568_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Person[] arr = new Person[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Person(sc.nextInt(), sc.nextInt());
        }

        solution(N, arr);


    }

    private static void solution(int n, Person[] arr) {
        int[] answer = new int[n];
        int cnt;
        for (int i = 0; i < n; i++) {
            cnt = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[i].w < arr[j].w && arr[i].h < arr[j].h) {
                        cnt++;
                    }

                }
            }
            System.out.print(cnt+" ");
        }
    }
}
