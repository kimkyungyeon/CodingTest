package problem.chapter01;

import java.util.Locale;
import java.util.Scanner;

public class Q1_1 {
    public static int solution(String str, char c){
        int count = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)== c){
//                count++;
//            }
//        }
        for(char x: str.toCharArray()){
            if(x == c){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        char c = in.nextLine().charAt(0);

        System.out.println(solution(str, c));
    }
}
