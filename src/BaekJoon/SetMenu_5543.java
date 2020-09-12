package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SetMenu_5543 {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int []burger =new int[3];
        burger[0] = Integer.parseInt(br.readLine());
        burger[1] = Integer.parseInt(br.readLine());
        burger[2] = Integer.parseInt(br.readLine());
        int drink [] =new int[2];
        drink[0] = Integer.parseInt(br.readLine());
        drink[1] = Integer.parseInt(br.readLine());
        br.close();
        Arrays.sort(burger);
        Arrays.sort(drink);
        System.out.println(burger[0]+drink[0]-50);

    }

}
