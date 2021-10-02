package problem.chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_10_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x+" ");
        }
    }

    private static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        for (int i=0; i<str.length(); i++) {
            answer[i] =100;
        }
        char[] arr = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(arr[i] == c){
                answer[i] = 0;
                for (int j = 0; j < str.length(); j++) {
                    if(i>j && answer[j]>i-j){
                        answer[j] = i-j;
                    } else if(i<j && answer[j]>j-i){
                        answer[j] = j-i;
                    }
                }
            }

        }



        return answer;
    }
}
