package BaekJoon.Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stars_10996 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        if(x == 1){
            System.out.println("*");
            return;
        }
        for(int i= 1; i<=2*x; i++) {
            if(i%2==1)
                star(x,0);
            else
                star(x,1);
        }

    }
    static void star(int i,int re){
        for (int j = 0; j < i  ; j++) {
            if(j%2 ==re)
                System.out.print("*");
            else
                System.out.print(" ");

        }
        System.out.println();
    }
}
