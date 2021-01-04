package Codeup;

import java.util.Scanner;

public class fibo_1915 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(fibo(a));
    }
    static int fibo(int a){
        if(a<=1)
            return a;
        else
            return fibo(a-1)+fibo(a-2);
    }
}
