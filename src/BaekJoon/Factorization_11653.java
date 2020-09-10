package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Factorization_11653 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        ArrayList<Integer>  temp = de(num);
        int i=0;
        int t;
        while (num>1){
            t = temp.get(i++);
            while(num%t==0){
                num=num/t;
                System.out.println(t);
            }
        }

    }
    static ArrayList<Integer> de( int num){
        ArrayList<Boolean> list = new ArrayList<Boolean>(num+1);
        list.add(false);
        list.add(false);

        for(int i=2; i<=num; i++)
            list.add(i,true);

        for(int i=2; (i*i)<=num; i++) {
            if (list.get(i)) {
                for (int j = i * i; j <= num; j += i) {
                    list.set(j, false);
                }
            }
        }
        ArrayList<Integer> re = new ArrayList<>();
        int j=0;
        for(int i=0; i<=num; i++) {
            if (list.get(i) == true) {
                re.add(j++,i);
            }
        }
        return re;
    }
}
