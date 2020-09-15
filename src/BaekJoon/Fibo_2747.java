package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        int first =0, second =1;
        int third =1 ;
        int i=2;
        while (i<=num){
            third = first + second;
            first = second;
            second = third;
            i++;
        }
        System.out.println(third);
    }
}
