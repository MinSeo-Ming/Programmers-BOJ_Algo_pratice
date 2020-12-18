package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Odd_2576 {
    public static void main(String args[]) throws IOException {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>();

        for(int i=0; i<7; i++){
            int num = sc.nextInt();
            if(num%2==1){
                list.add(num);
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            System.out.println(-1);
        }
        else{
            int result=0;
            for(int i=0; i<list.size(); i++){
                result +=list.get(i);
            }
            System.out.println(result);
            System.out.println(list.get(0));
        }

    }
}
