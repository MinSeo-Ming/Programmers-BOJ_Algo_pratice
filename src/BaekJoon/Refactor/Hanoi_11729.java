package BaekJoon.Refactor;

import java.io.*;

public class Hanoi_11729 {
    static  int count =0;
    static StringBuilder sb = new StringBuilder();
    static  int i=0;

    public static void main(String args[])throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        bf.close();
        hanoi(num,1,2,3);
        System.out.println(count);
        System.out.println(sb);
    }
    public static void hanoi( int num,int start,int middle,int result) {
        count++;
        if (num == 1) { // 원판이 1개일 때
            sb.append(start + " " + result + "\n");
            return;
        } else { // 원판이 1개가 아닐 때
            hanoi(num - 1, start, result, middle); // n-1을 한 후, 1->3->2로 원판을 전달
            sb.append(start + " " + result + "\n");
            hanoi(num - 1, middle, start, result); // n-1을 한 후, 2->1->3으로 원판을 전달
        }
    }
}
