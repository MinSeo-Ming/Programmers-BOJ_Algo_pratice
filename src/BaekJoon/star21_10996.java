package BaekJoon;

import java.io.*;

public class star21_10996 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        star(num);

    }
    static void star(int num) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<num; i++) {
            for(int j =0; j <num; j++){
                if(j%2==0)
                    bw.write('*');
                else
                    bw.write(' ');
            }
            bw.newLine();
            for(int j =0; j <num; j++){
                if(j%2==0)
                    bw.write(' ');
                else
                    bw.write('*');
            }
            bw.newLine();
        }

        bw.close();
    }
}
