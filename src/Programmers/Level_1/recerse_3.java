[조민서] [11:28 AM] class Solution {
    public int solution(int n) {
        StringBuffer temp = new StringBuffer();
        while(n>0){
            int t = n%3;
            temp.append(Integer.toString(t));
            n=n/3;
        }
      
        int answer = 0;
        int re=0;
        int length = temp.length();
        for(int i=0; i<length; i++){
            re= (int)Math.pow(3,length-i-1)*((int)temp.charAt(i)-48);
            
                 answer+=re;
        }
        return answer;
    }
    
}