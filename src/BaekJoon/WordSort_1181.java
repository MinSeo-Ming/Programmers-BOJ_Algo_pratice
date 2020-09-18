package BaekJoon;

import java.io.*;
import java.util.*;
public class WordSort_1181 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        String [] list = new String[num];
        for(int i=0; i<num; i++){
            list[i] = br.readLine();
        }
        br.close();
        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
            }
        });

        int j, len, len_temp;
        for(int i=0; i<num; i++) {
            len = list[i].length();
            for(j=i+1; j<num; j++) {
                len_temp = list[j].length();
                if(len != len_temp) break;
            }
            Arrays.sort(list, i, j);
            i=j-1;
        }

        System.out.println(list[0]); 
        for(int i=1; i<num; i++) { 
            if(list[i-1].equals(list[i])) 
                continue; 
            System.out.println(list[i]); 
        }

    }
}
