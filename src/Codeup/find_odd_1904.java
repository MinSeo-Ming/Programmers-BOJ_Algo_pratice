package Codeup;

import java.util.Scanner;

public class find_odd_1904 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int ed = sc.nextInt();
        repeat(st,ed);
    }
    static int repeat (int st, int ed){
        if(st>ed)
            return 0;
        else{
            if(st%2==1)
                System.out.println(st);
            return repeat(st+1, ed);
        }
    }
}
