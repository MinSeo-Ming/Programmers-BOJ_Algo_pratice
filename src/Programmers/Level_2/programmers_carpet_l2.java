public class programmers_carpet_l2 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];

            int mul = brown + yellow;
            int sum = (yellow -4 -mul)/(-2);

            for(int i=1; i<sum/2+1; i++){
                if(i * (sum-i)==mul){

                    answer[0]=sum-i;
                    answer[1]=i;
                    break;
                }
            }

            return answer;
        }
    }
}
