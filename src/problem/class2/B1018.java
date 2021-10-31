package problem.class2;

import java.util.Scanner;

public class B1018 {
    static int N, M;
    static char[][] arr;
    static int answer = Integer.MAX_VALUE;
    static int[][] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        arr = new char[N][M];
        ch = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }


        int w = count('W');
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                ch[i][j] = 0;
            }
        }

        int b = count('B');

        System.out.println(Math.min(w, b));
    }

    private static int count(char start) {
        char tmp = start;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if ((i + j) % 2 == 1) {
                    if (arr[i][j] == tmp) {
                        ch[i][j] = 1;
                    }

                } else {
                    if (arr[i][j] != tmp) {
                        ch[i][j] = 1;
                    }
                }
            }
        }

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(ch[i][j]);
//            }
//            System.out.println();
//        }


        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if (ch[k][l] == 1) {
//                            System.out.println("k : " + k + "l : " + l);

                            count += ch[k][l];
                        }
                    }
                }
//                System.out.println("count : " + count);
                answer = Math.min(answer, count);
            }
        }


        return answer;


    }
}
