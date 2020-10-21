import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    int num = sc.nextInt();
    double[] lists = new double[num];
    for(int i =0; i<num; i++){
      lists[i]=sc.nextDouble();
    }
    Arrays.sort(lists);
    for(int i=0; i<7; i++){
      System.out.printf("%.3f\n",lists[i]);
    }


       
  }
}