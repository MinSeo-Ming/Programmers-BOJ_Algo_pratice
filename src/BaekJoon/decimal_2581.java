package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class decimal_2581 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        br.close();
        de(num1,num2);

    }
    static void de(int num1, int num2){
        ArrayList<Boolean> list = new ArrayList<Boolean>(num2+1);
        list.add(false);
        list.add(false);

        for(int i=2; i<=num2; i++)
            list.add(i,true);

        for(int i=2; (i*i)<=num2; i++) {
            if (list.get(i)) {
                for (int j = i * i; j <= num2; j += i) {
                    list.set(j, false);
                }
            }
        }
        int re=-1;
        int sum =0;
        for(int i=num2; i>=num1; i--) {
            if (list.get(i) == true) {
                re = i;
                sum = sum+i;
            }
        }
        if(re ==-1)
            System.out.println(re);
        else
            System.out.println(sum+"\n"+re);
    }
}
