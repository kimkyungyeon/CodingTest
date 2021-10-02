package problem.chapter01;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_11_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "";
        str = str+ " ";
        char[] c = str.toCharArray();
        System.out.println(Arrays.toString(c));
        System.out.println(c.length);
        char tmp = ' ';
        int count = 1;
        for (int i=0; i<c.length-1; i++) {
            if(tmp != c[i]){
                tmp = c[i];
                answer += c[i];
            }
            if(c[i] == c[i+1]){
                count++;
            } else{
                if(count > 1){
                    answer += count;
                    count =1;

                }
            }
        }


        return answer;
    }
}
