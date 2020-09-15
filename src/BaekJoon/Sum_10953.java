package BaekJoon;

import java.util.Scanner;

public class Sum_10953 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        String tp [][]=new String[num+1][];
        for(int i=0; i<=num; i++){
            String temp =sc.nextLine();
            String []t= temp.split(",");
            tp[i] =t;
        }
        for(int i=1; i<=num; i++) {
            int f =0;
            for(int j=0; j<tp[i].length; j++) {
                String t = tp[i][j];
                //System.out.print(t);
                int s = Integer.parseInt(t);
                f= f+s;
            }
            System.out.println(f);
        }
    }
}
