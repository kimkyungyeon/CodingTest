package problem.chapter01;

import java.util.Scanner;

public class Q1_2 {
    public static String solution(String str){
        String ans = "";
        for(char x: str.toCharArray()){
            if(Character.isLowerCase(x)){
                ans += Character.toUpperCase(x);
            } else {
                ans += Character.toLowerCase(x);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(solution(str));

    }
}
