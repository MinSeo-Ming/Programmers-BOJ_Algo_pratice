[조민서] [10:06 AM] class Solution {
    public int solution(String s) {
        String temp = s;
        int answer = 0;
        char check =s.charAt(0);
        if(check=='-'||check=='+'){
            temp = s.substring(1);
        }
        int add =Integer.parseInt(temp);
        if(check=='-'){
            answer =-1*add;
        }
        else{
            answer = add;
        }
                
        return answer;
    }
}