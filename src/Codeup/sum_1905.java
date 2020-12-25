package Codeup;

import java.util.Scanner;

public class sum_1905 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(repeat(n));
    }
    static int repeat(int n){
        if(n==0)
            return 0;
        else
            return repeat(n-1)+n;
    }
}
