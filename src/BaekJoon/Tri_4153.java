package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Tri_4153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            int need []=new int[3];
            for(int i=0; i<3; i++){
                need[i]=sc.nextInt();
            }
            Arrays.sort(need);
            if(need[0]==0&&need[1]==0 &&need[2]==0)
                break;
            if(need[0]*need[0]+need[1]*need[1] == need[2]*need[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
