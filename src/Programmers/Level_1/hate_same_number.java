import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int length =arr.length;
        ArrayList <Integer> list = new ArrayList<Integer>();
        int[] answer ;
        
        list.add(arr[0]);
        int j=1;
       for(int i=1; i<arr.length; i++){
           if(list.get(j-1)==arr[i])
               continue;
           else{
               list.add(arr[i]);
               j++;
           }
       }
        answer= new int[list.size()];
        j=0;
        for(int tt : list){
            answer[j++]=tt;
        }
        return answer;
    }
}