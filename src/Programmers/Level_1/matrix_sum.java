class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int temp = x;
        int q=0;
        while(temp>9){
            q+=temp%10;
            temp /=10;
        }
        q+=temp;
        if(x%q!=0)
            answer=false;
        return answer;
    }
}
