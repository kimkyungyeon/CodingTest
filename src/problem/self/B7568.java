package problem.self;

import java.util.Scanner;

//덩치 브루트포스
public class B7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Person[] arr = new Person[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Person(sc.nextInt(), sc.nextInt());
        }

        for (int x : solution(N, arr)) {
            System.out.print(x + " ");
        }

    }

    private static int[] solution(int n, Person[] arr) {
        int[] answer = new int[n];
        int cnt;
        int cnt2;
        for (int i = 0; i < n; i++) {
            cnt = 1;
            cnt2 = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (arr[i].w < arr[j].w) {
                        cnt++;
                    }
                    if (arr[i].h < arr[j].h) {
                        cnt2++;
                    }
                }

            }
            arr[i].sw = cnt;
            arr[i].sh = cnt2++;
        }


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
            answer[i] = cnt;
        }

        return answer;
    }
}

class Person {
    int w;
    int h;
    int sw;
    int sh;
    int ts;

    public Person(int w, int h) {
        this.w = w;
        this.h = h;
    }
}
