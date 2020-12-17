package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class calculate_5613 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();

        finish:while(true) {
            String s = sc.next();
            if (s.contentEquals("="))
                break finish;
            int temp = sc.nextInt();
            if(s.contentEquals("/")){ result=result/temp;}
            if(s.contentEquals("+")){ result=result+temp;}
            if(s.contentEquals("-")){ result=result-temp;}
            if(s.contentEquals("*")){ result=result*temp;}
        }
        System.out.println(result);
    }
}
