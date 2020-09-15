package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi_3053 {
    static double PI= 3.1415926535897932384626433;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        System.out.printf("%.6f\n",num*num*PI);
        System.out.printf("%.6f\n",(double)num*2*num);
    }
}
