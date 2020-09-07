package Programmers.Level_2;

import java.util.Stack;

public class Stack_Queue_3 {
    //주식거래
    public static void main(String args[]) {
        Stack_Queue_3 s = new Stack_Queue_3();
        int bridge_length=2;
        int weight=10;
       // int[] truck_weights=new int []{[7,4,5,6]};
      //  int re =s.solution(bridge_length, weight,  truck_weights);
        //System.out.println(re);

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Stack<Integer> truck =new Stack<Integer>();
        Stack<Integer> bridge =new Stack<Integer>();

        for(int i : truck_weights)
            truck.push(i);
        while(!truck.empty()){
            int check= truck.pop();


        }

        int answer = 0;
        return answer;

    }
}
