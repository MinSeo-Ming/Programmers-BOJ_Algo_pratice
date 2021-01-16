package baek;

import java.io.*;
import java.util.*;

public class sum_numbers_2003 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        s = br.readLine();
        st = new StringTokenizer(s);

        ArrayList<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens())
            list.add(Integer.parseInt(st.nextToken()));
        int cnt =0;
        long sum = 0;
        int left=0, right=0;
        while (true){
            if(sum >= M){
                sum -= list.get(left++);

            }else if(right ==N){
                break;
            }
            else {
                sum += list.get(right++);
            }

            if(sum == M){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
