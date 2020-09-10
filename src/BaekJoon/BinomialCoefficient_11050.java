package BaekJoon;

import java.util.Scanner;

public class BinomialCoefficient_11050 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(fact(num1)/(fact(num2)*fact(num1-num2)));
    }
    static int fact(int num){
        if(num <=1)
            return 1;
        else
            return fact(num-1)*num;
    }
}
