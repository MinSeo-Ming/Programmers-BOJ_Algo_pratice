package Na_code;

import java.util.*;

public class num_card_game_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] cards = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                cards[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            int min = cards[i][0];
            for(int j =1; j<m; j++){
                if(min>cards[i][j])
                    min =cards[i][j];
            }
            results.add(min);
        }

        Collections.sort(results, Comparator.reverseOrder());
        System.out.println(results.get(0));
    }
}
/*
3 3
3 1 2
4 1 4
2 2 2
 */
/*
2 4
7 3 1 8
3 3 3 4
 */