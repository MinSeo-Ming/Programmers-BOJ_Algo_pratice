package BaekJoon.Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stars_10992 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        br.close();
        for(int i= 1; i<=x; i++) {
            for(int j =0; j<(x-i); j++)
                System.out.print(" ");
            System.out.print('*');
            if(i==x){
                for(int j=1; j<2*x-1; j++)
                    System.out.print("*");
                System.out.println();
                break;
            }
            else {
                for (int j = 0; j < 2 * (i - 1) - 1; j++)
                    System.out.print(" ");
                if (i != 1)
                    System.out.print('*');

                System.out.println();
            }
        }

    }
}
