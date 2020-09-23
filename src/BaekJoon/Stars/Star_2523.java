package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star_2523 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        star(x);

    }
    static void star(int x){
        for(int i=0; i<x; i++){
            for(int j=0 ;j<=i;  j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=x-1; i>0 ;i--){
            for(int j=i ;j>0;  j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
