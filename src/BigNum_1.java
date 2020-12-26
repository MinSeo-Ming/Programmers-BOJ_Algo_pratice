package Na_code;

import java.util.*;

public class BigNum_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int repeat = sc.nextInt();
        int max = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<size; i++)
            list.add(sc.nextInt());
        Collections.sort(list, Comparator.reverseOrder());

        int result =0;
        result+=repeat/(max+1) * (list.get(0) *max + list.get(1));
        result+=repeat%(max+1) * list.get(0);
        System.out.println(result);


    }
}
