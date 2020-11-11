import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer ={};
        int [] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
        int j=0;
        if(arr.length==1)
            answer=new int[]{-1};
        else{
            answer=new int[arr.length-1];
            for(int i=0; i<arr.length; i++){
                if(arr[i]==min)
                    continue;
                else
                    answer[j++]=arr[i];
            }
            
        }
        return answer;
    }
}
