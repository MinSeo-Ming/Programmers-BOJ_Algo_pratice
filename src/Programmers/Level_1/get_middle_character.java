[조민서] [11:14 AM] class Solution {
    public String solution(String s) {
        StringBuffer answer =new StringBuffer();
        
        int length = s.length();
        int middle = length/2;
        answer.append(s.charAt(middle));
        if(length%2==0){
            answer.insert(0,s.charAt(middle-1));
        }
            
        return answer.toString();
    }
}