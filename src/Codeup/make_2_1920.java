package Codeup;

import java.util.Scanner;

public class make_2_1920 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        repeat(n);
        if(n==0)
            System.out.println(0);
    }
    static void repeat(int n){
        if(n==0)
            return;
        repeat(n/2);
        System.out.print(n%2);
    }
}
