package BaekJoon;

import java.util.Scanner;

public class Tornerment_1057 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String re="";
        int len = input.length()-1;
        int a= 0;
        for(int i= 0; i<len+1 ; i++){
           int temp = input.charAt(i)-'0';
           temp =temp* (int)Math.pow(8,(len-i));
           a = a+ temp;
        }
        re = Integer.toBinaryString(a);
        System.out.println(re);
    }
}
