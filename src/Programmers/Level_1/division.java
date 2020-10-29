import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        int[] answer = {};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            answer=new int[]{-1};
            return answer;
        }
        answer = new int[list.size()];
        int j=0;
        for (int i:list){
            answer[j++]=i;
        }
        return answer;
    }
}