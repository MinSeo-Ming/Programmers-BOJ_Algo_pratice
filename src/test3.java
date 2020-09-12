import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class test3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String te = sc.nextLine();
        String te2 = sc.nextLine();
        String te_ []= te.split(",");

        String te_2 []= te2.split(",");
        int re [] = solution(te_,te_2);
        for(int i: re)
            System.out.print(i+ " ");

    }
    static int[] solution(String[] info, String[] query) {
        String input[][]= new String[query.length][];
        String tt[];
        int[] answer = new int [query.length];
        for(int i=0; i<info.length; i++) {
            String temp = info[i].replaceAll("\"","");
            tt= temp.split(" ");

            input[i]=tt;
        }
        String temp_q[][]= new String[query.length][];

        for(int i =0; i<query.length; i++){
            String temp2 = query[i].replaceAll("\"","");
            String temp = temp2.replaceAll("and","");
            String ttt = temp.replaceAll("  "," ");
            tt = ttt.split(" ");

            temp_q[i]=tt;
        }


        boolean ck = false;

        for(int j =0; j<temp_q.length; j++){
            String temp [] = temp_q[j];
            for(int i=0; i<input.length; i++) {
                for(int t=0; t<temp_q[j].length-1; t++){

                    if(input[i][t].equals(temp_q[j][t])|| temp_q[j][t].equals("-"))
                        ck = true;
                    else
                        ck =false;
                    //System.out.println(ck);
                    if(ck==false)
                        break;


                }
                String test=temp_q[j][temp_q[j].length-1];
                String test2 =input[i][4];


                int cmp = Integer.parseInt(test2);

                int cmp2 = Integer.parseInt(test);

                if(ck==true && (cmp>=cmp2))
                    answer[j]++;
            }
        }


        return answer;
    }

}
