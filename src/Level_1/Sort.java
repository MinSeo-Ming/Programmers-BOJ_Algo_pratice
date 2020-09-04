package Level_1;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Solution s = new Solution();
        int test[]=new int [] {1, 5, 2, 6, 3, 7, 4};
        int cmd[][]=new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int re []= s.solution(test,cmd);
        for(int i=0; i<re.length; i++)
            System.out.println(re[i]);

    }
}

class Solution{
    public int [] solution(int[] array, int [][]commands){
        int []answer =new int [commands.length];

        int row=0;

        while(row<commands.length) {
            int start = commands[row][0] -1;
            int end = commands[row][1]-1;
            int want =commands[row][2]-1;
            int temp[]=new int[end-start+1];

            int num=0;
            for (int i = start; i <= end; i++) {
                temp[num] = array[i];

                num++;
            }

            Arrays.sort(temp);
            answer[row] = temp[want];
            row++;
        }
        return answer;
    }


}

