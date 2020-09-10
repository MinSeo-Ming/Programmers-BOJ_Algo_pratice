package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Measure_1037 {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int me[] =new int[num];

        for(int i =0; i<num; i++){
            me[i] =sc.nextInt();
        }
        Arrays.sort(me);
        System.out.println(me[0]*me[num-1]);
    }

}
