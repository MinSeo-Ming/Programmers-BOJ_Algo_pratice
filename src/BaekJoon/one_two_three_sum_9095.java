import java.util.Scanner;

public class one_two_three_sum_9095 {
    static int count[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        count=new int[20];
        for(int i=0; i<num; i++){
            int get = sc.nextInt();
            System.out.println(sum(get));
        }
    }
    static int sum(int n){
        if(n==1)return 1;
        if(n==2)return 2;
        if(n==3)return 4;
        if(count[n]>0)return count[n];
        count[n]=sum(n-1)+sum(n-2)+sum(n-3);
        return count[n];
    }
}
