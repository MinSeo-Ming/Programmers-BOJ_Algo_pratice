package BaekJoon;

import java.util.Scanner;

public class Star_2440 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num-1; i>=0; i--){
            for(int k =0; k<=i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
