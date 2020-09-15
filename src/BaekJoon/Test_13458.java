package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_13458 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int [] classes = new int[count];

        for(int i=0; i<count; i++)
            classes[i] = sc.nextInt();

        int maxMain = sc.nextInt();
        int maxSub = sc.nextInt();

        long result = count;
        for(int i=0; i<count; i++){
            classes[i] -= maxMain;

            if(classes[i] > 0) {
                result+=classes[i]/maxSub;
                if( classes[i]%maxSub !=0) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }
}
