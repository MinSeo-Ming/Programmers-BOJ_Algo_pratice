class Solution {
    public String solution(String s, int n) {
        StringBuffer answer = new StringBuffer();
        for(int i=0; i<s.length();i++){
        char c =s.charAt(i);
        if(65<=c&&c<=90){
            c+=n;
            if(c>90)
                c-=26;
        }
        else if(97<=c&&c<=122){
            c+=n;
            if(c>122)
                c-=26;
        }
        answer.append((char)c);
        }
        return answer.toString();
    }
}