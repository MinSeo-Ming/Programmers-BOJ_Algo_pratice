package BaekJoon.Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stars_10990 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        for(int i= 1; i<=x; i++) {
            for(int j =0; j<(x-i); j++)
                System.out.print(" ");
            System.out.print('*');
            for(int j =0; j<2*(i-1)-1; j++)
                System.out.print(" ");
            if(i!=1)
                System.out.print('*');
            System.out.println();
        }

    }
}
