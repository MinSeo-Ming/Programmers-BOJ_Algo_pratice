package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GrWordChecker_1316 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String strs[] =new String[num];
        for(int i=0; i<num; i++)
            strs[i]=br.readLine();
        br.close();
        int count =0;
        char pre_char;
        for(int i=0; i<num; i++){
            count++;
            boolean apla[] = new boolean[26];
            Arrays.fill(apla,Boolean.FALSE);
            pre_char=strs[i].charAt(0);
            apla[pre_char-97]=true;
            for(int j=1; j<strs[i].length(); j++){
                char check=strs[i].charAt(j);
                if(pre_char==check)
                    continue;
                if(apla[check-97]==true) {
                    count--;
                    break;
                }
                pre_char = check;
                apla[check-97]=true;

            }
        }
        System.out.println(count);
    }
}
