package baek;

import java.util.Scanner;

public class GCD_1850 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long temp;
        while(b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }

        while (a>0){
            System.out.print(1);
            a--;
        }
        System.out.println();

    }
}
