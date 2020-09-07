package Programmers.skill_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class greedy {
    public static void main(String args[]){
        int n =5;
        int[] lost= new int[]{2, 4};
        int[] reserve= new int[]{1, 3, 5};
        int re = new greedy().solution(n,lost,reserve);
        System.out.println(re);

    }
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        int answer = n-lost.length;
        ArrayList<Integer> re = (ArrayList<Integer>) Arrays.stream(reserve).boxed().collect(Collectors.toList());
        ArrayList<Integer> lo = (ArrayList<Integer>) Arrays.stream(lost).boxed().collect(Collectors.toList());
        for(int i =0; i<lo.size(); i++){
            for(int j =0; j<re.size(); j++){
                if(lo.get(i)==re.get(j)) {
                    re.set(j,-1);
                    lo.set(i,-1);
                    answer++;
                    break;
                }
            }
        }
        for(int i =0; i<lo.size(); i++){
            for(int j =0; j<re.size(); j++){

                if(lo.get(i)-re.get(j) ==1||re.get(j)-lo.get(i)==1){
                    re.remove(j);
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
