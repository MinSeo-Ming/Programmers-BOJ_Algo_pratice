[조민서] [10:24 AM] import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        String regex= "^[0-9]+$";
        boolean answer = true;
        if(s.length()==4||s.length()==6){
            if(!s.matches(regex))
                answer=false;
        }
        else
            answer=false;
        return answer;
    }
}