import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        int length = (int)(Math.log10(n)+1);
        Integer arr[]= new Integer[length];
        for(int i=0; i<length; i++){
            int temp = (int)(n%10);
            n=n/10;
            arr[i]=temp;
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0; i<length; i++){
            answer+=(long)(Math.pow(10,length-i-1)*arr[i]);
        }


        return answer;
    }
}