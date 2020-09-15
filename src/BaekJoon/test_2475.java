package BaekJoon;

import java.util.Scanner;

public class test_2475 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int f_1 = sc.nextInt();
        int f_2 = sc.nextInt();
        int f_3 = sc.nextInt();
        int f_4 = sc.nextInt();
        int f_5 = sc.nextInt();
        System.out.println((f_1*f_1+f_2*f_2+f_3*f_3+f_4*f_4+f_5*f_5)%10);
    }
}
