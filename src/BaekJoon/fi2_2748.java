package BaekJoon;

import java.util.Scanner;

public class fi2_2748 {
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long tmp[] = new long[91];

        tmp[0] = 0;
        tmp[1] = 1;
        for(int i = 2; i < N+1; i++){
            tmp[i] =  tmp[i-2] + tmp[i-1];
        }
        System.out.println(tmp[N]);
    }

}
