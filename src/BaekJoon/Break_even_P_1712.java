package BaekJoon;


import java.util.Scanner;

public class Break_even_P_1712 {
    public static void main(String args[])  {
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        if (num2 >= num3) System.out.printf("-1\n");
        else System.out.printf("%d",num1/(num3-num2)+1);
    }
}
