class Solution {
    public String solution(int num) {
        String answer = "";
        String odd="Odd";
        String even ="Even";
        if(num%2==0)
            answer=even;
        else
            answer=odd;
        return answer;
    }
}