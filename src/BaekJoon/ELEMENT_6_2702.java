package baek;

import java.util.Scanner;

public class ELEMENT_6_2702 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for(int i=0; i<repeat; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int lcd = a*b;

            if(a<b){
                int temp = a;
                a =b;
                b=temp;
            }
            while(b!=0){
                int temp = a%b;
                a = b;
                b = temp;
            }
            System.out.print(lcd/a +" ");
            System.out.println(a);
        }
    }
}
