package baek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Maraton_9339 {
    public static void main(String args[]) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> temp;


        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            temp = new HashMap<>();
            int k =Integer.parseInt(br.readLine());
            String s =br.readLine();
            StringTokenizer st1 = new StringTokenizer(s);
            for ( String actualElement : s.split(" ") ) {
                temp.put(actualElement,
                        Integer.MAX_VALUE);
            }
            int pass=0;
            int N =Integer.parseInt(br.readLine());

            for(int num=0; num<N; num++){
                String input= br.readLine();
                StringTokenizer st2 = new StringTokenizer(input);
                String number = st2.nextToken();
                int hour = Integer.parseInt(st2.nextToken());
                int min = Integer.parseInt(st2.nextToken());
                int take_time =hour*60+min;
                if(take_time>0&&take_time<=360 && temp.containsKey(number)){
                    temp.put(number,take_time);
                    pass++;
                }


            }
            Map.Entry<String,Integer> minEntry =null;
            for (Map.Entry<String, Integer> entry : temp.entrySet()) {

                if (minEntry == null || minEntry.getValue() > entry.getValue()) {

                    minEntry = entry;

                }

            }

            System.out.print(Integer.parseInt(minEntry.getKey()) );
            System.out.print(" ");
            System.out.println(pass);
        }


    }
}
