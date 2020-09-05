package skill_level1;

import java.util.HashMap;
import java.util.Map;

public class Skill_Level1_Q1 {
    public static void main(String args[]){
        int test=125;
        int re=new Skill_Level1_Q1().solution(test);
        System.out.println(re);
    }
    public int solution(int n){
        int answer = 0;
        String test = String.valueOf(n);
        for (int i = 0; i < test.length(); i++)
            answer = answer + (test.charAt(i) - '0');
        return answer;
    }

}
