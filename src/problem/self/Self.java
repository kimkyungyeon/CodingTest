package problem.self;

import java.util.Scanner;

public class Self {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int a= sc.nextInt();
            int n= sc.nextInt();
            int m= sc.nextInt();



            System.out.println("#"+test_case+ " "+ mul(n,m));


        }



    }

    public static int mul(int n, int m){
        int answer= 1;
        if(n==0) return 0;
        if(m==0) return 1;
        else {
            for(int i=0; i<m; i++){
                answer *= n;
            }
            return answer;
        }
    }
}