package BaekJoon.Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stars_2443 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();

        for(int i= x; i>0; i--){
            for(int j =x-i; j>0; j--)
                System.out.print(" ");
            for(int j =2*i-1;j>0; j--)
                System.out.print('*');
            System.out.println();
        }


    }
}
