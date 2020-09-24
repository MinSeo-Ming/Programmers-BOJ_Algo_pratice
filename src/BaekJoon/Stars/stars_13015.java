package BaekJoon.Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stars_13015 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x =1;
        while(x!=0) {
            x = Integer.parseInt(br.readLine());

            for (int i = 1; i <= x; i++) {
                star(x, i);
            }
            for (int i = x - 1; i > 0; i--) {
                star(x, i);
            }
        }

    }
    static void star(int x,int i){
        if(i==1){
            for(int j=0; j<x; j++)
                System.out.print("*");
            for(int j=0; j<2*(x-2)+1; j++)
                System.out.print(" ");
            for(int j=0; j<x; j++)
                System.out.print("*");
            System.out.println();
            return;
        }
        else {
            for(int j =0; j<i-1; j++)
                System.out.print(" ");
            System.out.print('*');
            for (int j = 0; j < x-2; j++)
                System.out.print(" ");
            System.out.print('*');
            // 중간 띄어쓰기
            for(int j=0; j<2*(x-1-i)+1; j++)
                System.out.print(" ");

            //마무리
            if(i!=x)
                System.out.print('*');
            for (int j = 0; j < x-2; j++)
                System.out.print(" ");
            System.out.print('*');
            System.out.println();
            return;
        }
    }
}
