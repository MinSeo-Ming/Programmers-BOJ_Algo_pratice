package skill_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Skill_Level_Q2 {
    public static void main(String args[]){
        String s ="Zbcdefg";
        s=new Skill_Level_Q2().solution(s);
        System.out.println(s);
    }
    public String solution(String s) {
        String answer = "";
        String []test = s.split("");
        Arrays.sort(test);
        Collections.reverse(Arrays.asList(test));
        for(String i : test){
            answer = answer.concat(i);
        }
        return answer;
    }
}
