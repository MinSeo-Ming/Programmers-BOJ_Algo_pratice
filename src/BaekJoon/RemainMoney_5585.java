package BaekJoon;

import java.util.Scanner;

public class RemainMoney_5585 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = 1000 -num;

        int count =0;
        count = num/500;
        num= num%500;
        count = count+ num/100;
        num= num%100;
        count = count+ num/50;
        num= num%50;
        count = count+ num/10;
        num= num%10;
        count = count+ num/5;
        num= num%5;
        count =count+num;

        System.out.println(count);
    }
}
