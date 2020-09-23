package BaekJoon.Stars;

import java.io.*;

public class star9_2446 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        star(num);

    }
    static void star(int num) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<num; i++){
            for(int t =0; t<i; t++)
                bw.write(' ');
            for(int j = (num-i)*2-1; j>0; j--)
                bw.write('*');
            bw.newLine();
        }//위의 별
        for(int i =num-2; i>-1; i--){
            for(int t =0; t< i; t++)
                bw.write(' ');
            for(int j = 0; j<(num-i)*2-1; j++)
                bw.write('*');
            bw.newLine();
        }
        bw.close();
    }
}
