package baek;

import java.util.Scanner;

public class three_num_2985 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a+b ==c){
            System.out.print(a+"+"+b+"="+c);
        }
        else if(a-b ==c){
            System.out.print(a+"-"+b+"="+c);
        }

        else if(a*b ==c){
            System.out.print(a+"*"+b+"="+c);
        }
        else if(a/b ==c){
            System.out.println(a+"/"+b+"="+c);
        }
        else if(c+b ==a){
            System.out.print(a+"="+b+"+"+c);
        }
        else if(b-c ==a){
            System.out.print(a+"="+b+"-"+c);
        }

        else if(b*c ==a){
            System.out.print(a+"="+b+"*"+c);
        }
        else if(b/c ==a){
            System.out.println(a+"="+b+"/"+c);
        }

    }
}
