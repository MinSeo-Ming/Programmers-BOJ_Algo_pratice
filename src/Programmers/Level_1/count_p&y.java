[조민서] [9:18 AM] class Solution {
    boolean solution(String s) {
        int count_y =0;
        int count_p =0;
        boolean answer = true;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='y'||s.charAt(i)=='Y')
                count_y++;
            else if(s.charAt(i)=='p'||s.charAt(i)=='P')
                count_p++;
        }
        if(count_y!=count_p)
            answer =false;
        

        return answer;
    }
}