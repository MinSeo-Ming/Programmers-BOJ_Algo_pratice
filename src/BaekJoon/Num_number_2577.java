package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_number_2577 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        br.close();

        long re = a*b*c;
        String temp = String.valueOf(re);
        int count[]=new int[10];
        for(int i=0; i<temp.length(); i++){
            int t= temp.charAt(i)-'0';
            count[t]++;
        }
        for(int i: count)
            System.out.println(i);

    }
}
