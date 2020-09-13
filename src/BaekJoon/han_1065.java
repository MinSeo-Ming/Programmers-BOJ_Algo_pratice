package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class han_1065 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        int count=99;
        String temp = String.valueOf(num);
        if(num<100){
            System.out.println(num);
        }
        else{
            for(int i=100; i<=num; i++ ){
                int temp_1 = i/100 - (i%100)/10;
                int temp_2 =  (i%100)/10 - i%10;
                if(temp_1==temp_2){
                    count++;
                }
            }
        System.out.println(count);
        }
    }
}
