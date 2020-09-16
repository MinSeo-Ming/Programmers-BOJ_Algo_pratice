package BaekJoon;



import java.util.ArrayList;
import java.util.Scanner;

public class Scale_2920 {
    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer> asc =new ArrayList<>();
        ArrayList<Integer> des =new ArrayList<>();
        for(int i=0; i<8; i++)
            list.add(i, sc.nextInt());
        for(int i=1; i<=8; i++){
            asc.add(i);
            des.add(9-i);
        }
        if(list.equals(asc))
            System.out.println("ascending");
        else if(list.equals(des))
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
