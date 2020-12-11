class Solution {
    public String solution(String phone_number) {
        StringBuffer answer=new StringBuffer() ;
        int len =phone_number.length();
        String temp_4 = phone_number.substring(len-4);
        for(int i=0; i<len-4; i++)
            answer.append("*");
        answer.append(temp_4);
        
        return answer.toString();
    }
}
