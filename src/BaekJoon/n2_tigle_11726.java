import java.util.Scanner;

public class n2_tigle_11726 {
    static int count[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        count=new int[num+1];
        System.out.println(c(num));
    }
    static int c(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if(n==2)return 3;
        if (count[n] > 0) return count[n];
        count[n] = c(n - 1) + c(n - 2)*2;
        count[n] %= 10007;
        return count[n];
    }
}
