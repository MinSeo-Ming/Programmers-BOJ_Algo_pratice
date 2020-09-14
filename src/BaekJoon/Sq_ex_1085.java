package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sq_ex_1085 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int x  = sc.nextInt();
        int y  = sc.nextInt();
        int r_w  = sc.nextInt();
        int r_h  = sc.nextInt();

        list.add(x);
        list.add(y);
        list.add(r_w-x);
        list.add(r_h-y);
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
