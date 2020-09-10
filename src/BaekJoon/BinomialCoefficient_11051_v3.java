package BaekJoon;


import java.util.Scanner;

public class BinomialCoefficient_11051_v3 {

    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int[][] check =new int[num1+1][num1+1];
        check[1][0]=check[1][1]=1;
        for(int i=2; i<=num1; i++){
            for(int j =0; j<=i; j++){
                if(j>num2)
                    continue;
                else if(i==j||j==0)
                    check[i][j]= 1;
                else {
                    check[i][j] = (check[i - 1][j - 1] + check[i - 1][j]);
                    check[i][j] %= 10007;
                }
            }
        }
        System.out.println(check[num1][num2]);
    }
}
