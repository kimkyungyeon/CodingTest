package problem.chapter06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_04_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        int S = sc.nextInt();
        int N = sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(S, N, arr)) {
            System.out.print(x + " ");
        }

    }

//    private static int[] solution(int s, int n, ArrayList<Integer> arr) {
//        ArrayList<Integer> map = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            map.add(0, arr.get(i));
//            if (map.size() == s) {
//                for (int x : map) {
//                    if (arr.get(i) == x) {
//                        map.remove(i);
//
//                    }
//                }
//            }
//        }
//    }

    private static ArrayList<Integer> solution(int s, int n, int[] arr) {
        ArrayList<Integer> map = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (map.size() == s) {
                int count = 0;
                for (int j = 0; j < s; j++) {
                    if (arr[i] == map.get(j)) {
                        map.remove(j);
                        map.add(0, arr[i]);
                    } else {
                        count++;
                    }

                }

                if (count == s) {
                    map.add(0, arr[i]);
                    map.remove(s);
                }
            } else {
                int count = 0;
                for (int j = 0; j < map.size(); j++) {
                    if (arr[i] == map.get(j)) {
                        map.remove(j);
                        map.add(0, arr[i]);
                    } else {
                        count++;
                    }
                }


                if (count == map.size()) {
                    map.add(0, arr[i]);
                    map.remove(map.size());
                }
            }

            for (int x : map) {
                System.out.print(x+ " ");
            }
            System.out.println();
        }


        return map;

    }

}

