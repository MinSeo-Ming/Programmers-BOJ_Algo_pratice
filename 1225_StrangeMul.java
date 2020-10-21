import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    List<Integer> sec = new ArrayList<Integer>();

    int fir_num = sc.nextInt();
    int sec_num = sc.nextInt();
    int temp =0;

    while(fir_num>9){
      temp = fir_num%10;
      fir.add(temp);
      fir_num = fir_num/10;

    }
    fir.add(fir_num);

    while(sec_num>9){
      temp = sec_num%10;
      sec.add(temp);
      sec_num = sec_num/10;

    }
    sec.add(sec_num);
    int temp2 =0;

    long result =0;
    for(int i=0; i<fir.size(); i++){
      temp= fir.get(i);
      for(int j =0; j<sec.size(); j++){
        temp2 =sec.get(j);
        result += temp*temp2;
      }

    }
    System.out.println(result);
    
  }
}