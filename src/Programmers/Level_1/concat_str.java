[조민서] [10:13 AM] class Solution {
    public String solution(int n) {
        StringBuffer answer = new StringBuffer();
        String water="수박";
        String add="수";
        
        for(int i=0; i<n/2; i++)
            answer.append(water);
        if(n%2!=0)
            answer.append(add);
        return answer.toString();
    }
}