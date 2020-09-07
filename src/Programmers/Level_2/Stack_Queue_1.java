package Programmers.Level_2;

public class Stack_Queue_1 {
    //주식거래
    public static void main(String args[]) {
        Stack_Queue_1 s = new Stack_Queue_1();
        int []price = new int[]{1, 2, 3, 2, 3};
        int[] re =s.solution(price);
        for(int i : re)
            System.out.println(i);

    }
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length-1; i++){
            for(int j =i+1; j<prices.length; j++){
                answer[i]++;
                if(prices[i]>prices[j])
                    break;
            }
        }
        return answer;
    }
}
