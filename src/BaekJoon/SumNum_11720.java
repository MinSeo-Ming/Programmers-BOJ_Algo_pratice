package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNum_11720 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String frist = br.readLine();
        br.close();
        int sum =0;
        for(int i=0; i<num; i++)
            sum =sum+frist.charAt(i)-'0';
        System.out.println(sum);
    }
}
