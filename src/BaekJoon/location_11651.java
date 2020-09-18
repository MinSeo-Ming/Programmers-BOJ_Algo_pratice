package BaekJoon;

import java.io.*;
import java.util.*;
public class location_11650 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int loc [][] =new int[num][2];
        for(int i =0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            loc[i][0] = Integer.parseInt(st.nextToken());
            loc[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(loc, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                if(t1[1]==t2[1])
                    return t1[0]-t2[0];
                else
                    return t1[1]-t2[1];
            }
        });
        for(int i=0; i< num; i++)
            System.out.println(loc[i][0]+" "+loc[i][1]);
    }
}
