package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlpa_10809 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();
        int length = str.length();

        int count[]=new int[26];
        for(int i=0; i<count.length; i++)
            count[i]=-1;
        for(int i=0; i<length; i++){
            int c = str.charAt(i)-'0'-49;
            if(count[c]==-1)
                count[c]=i;
        }
        for(int i: count)
            System.out.print(i+" ");

    }
}
