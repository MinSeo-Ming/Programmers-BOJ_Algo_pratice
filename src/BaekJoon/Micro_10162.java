package BaekJoon;

import java.util.Scanner;

public class Micro_10162 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int A = 300;
        int B = 60;
        int C = 10;

        int result1 =0;
        int result2 =0;
        int result3 =0;

        result1 = input/A;
        input=input%A;
        result2 = input/B;
        input=input%B;
        result3 = input/C;
        input=input%C;
        if(input!=0)
            System.out.println(-1);
        else
            System.out.println(result1+" "+result2+" "+result3);
    }
}
