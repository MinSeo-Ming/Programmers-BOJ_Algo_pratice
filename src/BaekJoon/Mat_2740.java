package BaekJoon;


import java.util.Scanner;

public class Mat_2740 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int row  = sc.nextInt();
        int col  = sc.nextInt();

        int A[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                A[i][j] =sc.nextInt();
            }
        }

        int row_2  = sc.nextInt();
        int col_2  = sc.nextInt();
        int B[][]=new int[row_2][col_2];

        for(int i=0; i<row_2; i++){
            for(int j=0; j<col_2; j++){
                B[i][j] =sc.nextInt();
            }
        }

        int re[][]=new int[row][col_2];


        for(int i=0; i<row; i++){
            for(int k =0; k<col_2; k++) {
                for(int j =0; j<row_2; j++)
                    re[i][k] +=A[i][j] *B[j][k];
            }
        }
        for(int []i: re ){
            for (int j: i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
/*

re[1][1] = a[1][0]*b[0][1]+[]
* */