class Solution {
    public long solution(long n) {
        long answer = 0;
        long sq = (long)(Math.sqrt(n));
        if(sq*sq==n)
            answer = (sq+1)*(sq+1);
        else
            answer=-1;
        return answer;
    }
}
