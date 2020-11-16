import java.util.Scanner;

public class Make_ONE_1463 {
    static int m[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        m= new int[num+1];
        System.out.println(make_one(num));
    }
    static int make_one(int in){
        if(in ==1) return 0;
        if(m[in]>0) return m[in];
        m[in]=make_one(in-1)+1;
        if(in%2==0){
            int temp = make_one(in/2)+1;
            if(m[in]>temp)
                m[in]=temp;

        }
        if(in%3==0){
            int temp = make_one(in/3)+1;
            if(m[in]>temp)
                m[in]=temp;
        }
        return m[in];
    }
}
