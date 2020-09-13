package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordStudy_1157 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        str = str.toUpperCase();

        int length = str.length();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<26; i++) {
            char c = (char)(i+65);
            map.put(c, 0);
        }
        int check =0;
        for(int i=0; i<length; i++){
            char c = str.charAt(i);
            int val = map.get(c);
            if(check< val+1)
                check= val+1;
            map.put(c,++val);
        }
        String temp = getKey(map,check);
        if(temp.length()>1)
            System.out.println("?");
        else
            System.out.println(temp);
    }
    public static String getKey(Map<Character, Integer> map, int value) {
        // 찾을 hashmap 과 주어진 단서 value
        String re = "";
        for (Character o : map.keySet()) {
            if (map.get(o).equals(value)) {
                re = re + o;
            }
        }
        return re;
    }
}
