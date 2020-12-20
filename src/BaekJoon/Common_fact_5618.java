package baek;

import java.io.*;
import java.util.*;

public class Common_fact_5618 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        for(int i=1; i<=arr[0]; i++) {
            int count = 0;

            for(int j=0; j<n; j++) {
                if(arr[j] % i == 0)
                    count ++;
            }

            if(count == n)
                System.out.println(i);
        }


        bf.close();

    }
}
