package baek;

import java.util.Scanner;

public class Min_Coin_11047 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int coin_kind_num = sc.nextInt();
        int price = sc.nextInt();
        int ck[]= new int[coin_kind_num];
        for(int i=0; i<coin_kind_num; i++){
            ck[i]= sc.nextInt();

        }
        int aws =0;
        int idx = coin_kind_num-1;
    while (price!=0){
            if(ck[idx]<=price){

                aws += price/ck[idx];
                price =price % ck[idx];
            }
            idx -=1;
        }
        System.out.println(aws);
    }
}
