package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Remain_3052 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input[]= new int[10];
        for(int i=0; i<10; i++)
            input[i] =Integer.parseInt(br.readLine());
        br.close();
        HashSet<Integer> set =new HashSet<>() ;
        for(int i=0; i<10; i++){
            set.add(input[i]%42);
        }
        System.out.println(set.size());

    }
}
