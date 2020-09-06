package Level_2;

import java.util.*;
import java.util.stream.Collectors;

public class Stack_Queue_2 {
    //주식거래
    public static void main(String args[]) {
        Stack_Queue_2 s = new Stack_Queue_2();
        int []progress = new int[]{0,0,0};
        int [] speed =new int []{1,1,1};
        int[] re =s.solution(progress,speed);
        for(int i : re)
            System.out.println(i);

    }
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int remain []= new int[progresses.length];
        for(int i =0; i< progresses.length; i++){
            int temp = (100- progresses[i])%speeds[i];
            if(temp ==0)
                remain[i]=(100- progresses[i])/speeds[i];
            else
                remain[i]=(100- progresses[i])/speeds[i]+1;
        }
        int a_i =0;
        int a_v =0;
        for( int i=0; i<remain.length; i++){
            int idx =i;
            a_v=0;
            map.put(a_i,++a_v);
            for(int j=i+1; j<remain.length; j++) {
                if (remain[idx] >= remain[j]) {
                    map.put(a_i,++a_v);
                    i=j;
                }
                else
                    break;
            }
            a_i++;
        }

        int []answer = new int[map.size()];
        for(int i=0; i<map.size(); i++){
            answer[i]=map.get(i);
        }

        return answer;
    }
}
