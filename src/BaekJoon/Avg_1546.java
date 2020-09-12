package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Avg_1546 {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int input[] = new int[num];

        int sum=0;
        for(int i=0; i<num; i++) {
            input[i] = sc.nextInt();
            sum+=input[i];
        }
        sc.close();
        Arrays.sort(input);
        int max = input[num-1];
        double avg = 100.0 *sum/max/num;
        System.out.println(avg);


    }
}
