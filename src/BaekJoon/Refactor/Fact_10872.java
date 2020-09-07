package BaekJoon.Refactor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fact_10872 {
    public static void main(String args[]) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());//buffer reader로 입력 받기
        bf.close();

        int result = fact(n);
        System.out.println(result);

    }
    public static int fact (int n){
        if(n<=1)
            return 1;
        else
            return fact(n-1)*n;
    }
}
