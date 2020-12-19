package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class guess_golden_6588 {
    public static final int n = 1000000;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Boolean> list = new ArrayList<Boolean>();

        list.add(0, false);
        list.add(1, false);
        for (int i = 2; i <= n; i++)
            list.add(i, true);
        for (int i = 2; (i * i) <= n; i++) {
            for (int j = i * i; j < n; j += i)
                list.set(j, false);
        }
        break_while:
        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0)
                break break_while;
            boolean ck = false;
            for (int i = 3; i < num / 2 + 1; i++) {
                if (list.get(i) == true && list.get(num - i) == true) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    ck = true;
                    break;
                }
            }
            if (!ck)
                System.out.println("Goldbach's conjecture is wrong.");

        }
    }

}