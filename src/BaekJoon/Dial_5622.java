package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial_5622 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();
        input= input.toUpperCase();
        int sum = input.length();
        for(int i=0; i<input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    sum = sum + 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sum = sum + 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sum = sum + 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sum = sum + 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sum = sum + 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum = sum + 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sum = sum + 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum = sum + 9;
                    break;
            }
        }
        System.out.println(sum);

    }
}
