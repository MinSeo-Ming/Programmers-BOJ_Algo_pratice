package Na_code;

import java.io.*;
import java.util.*;

public class when_be_one_3 {
    static int cnt=0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        repeat(n,k);
        System.out.println(cnt);

    }
    static int repeat (int n, int k){
        if(n==1) return 0;
        else if(n%k==0){
            cnt ++;
            return repeat(n/k,k);
        }else{
            cnt++;
            return repeat(n-1,k);
        }
    }
}
