package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GoldenBa_9020 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int []list = new int[num+1];
        for(int i=0; i<num; i++){
            list[i] =Integer.parseInt(br.readLine());
        }
        for(int i=0; i<num; i++) {

            sum(list[i]);
        }
    }
    static void sum(int input){
        ArrayList<Boolean> list = new ArrayList<Boolean>(input+1);
        list.add(false);
        list.add(false);

        for(int i=2; i<=input; i++)
            list.add(i,true);

        for(int i=2; (i*i)<=input; i++) {
            if (list.get(i)) {
                for (int j = i * i; j <= input; j += i) {
                    list.set(j, false);
                }
            }
        }// 소수 찾기

        int middle = input/2;
        if(list.get(middle)==true){
            System.out.println(middle+" "+middle);
            return;
        }
        else {
            for (int i = middle - 1; i >= 0; i--) {
                int temp = input - i;
                if (list.get(i) == true && list.get(temp) == true) {
                    System.out.println(i + " " + (input - i));
                    return;
                }
            }
        }
    }

}
