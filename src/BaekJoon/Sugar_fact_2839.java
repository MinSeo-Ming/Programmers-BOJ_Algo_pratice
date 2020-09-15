package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar_fact_2839 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg=Integer.parseInt(br.readLine());
        br.close();
        re(kg);


    }
    static void re (int kg){
        int min= Integer.MAX_VALUE;

        for(int i=0; i<=kg/3+1; i++) {
            for(int j=0; j<=kg/5+1; j++) {
                if(3*i+5*j==kg&&min>i+j)
                    min = i+j;
            }
        }
        if(min==Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min);
    }
}
