class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int length =(int)(Math.log10(n)+1);
        answer = new int[length];
        int i=0;
        while(n>9){
            int temp = (int)(n%10);
            if(temp==0)
                answer[i++]=0;
            else
                answer[i++]=temp;
            n=n/10;
        }
        answer[i]=(int)n;
        return answer;
    }
}