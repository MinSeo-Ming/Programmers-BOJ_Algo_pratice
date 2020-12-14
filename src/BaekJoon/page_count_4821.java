package baek;
import java.util.*;

public class page_count_4821 {
    static boolean check [];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (true){
            int page =sc.nextInt();
            String fake =sc.nextLine();
            check = new boolean[page+1];
            if(page==0)
                break;
            else{
                int aws =0;
                String line = sc.nextLine();
                String spilt_line[] = line.split(",");

                for(int i=0; i<spilt_line.length; i++){

                    String temp[];
                    int low =0, high =0;
                    if(spilt_line[i].contains("-")) {
                        temp = spilt_line[i].split("-");
                        low = Integer.parseInt(temp[0]);
                        high = Integer.parseInt(temp[1]);
                    }
                    else{
                        check[Integer.parseInt(spilt_line[i])] =true;
                        continue;
                    }

                    if(low > high)
                        continue;
                    else if(low>=page)
                        continue;
                    else if(high>=page){
                        for(int j =low; j<=page; j++){
                            if(check[j]!=true)
                                check[j]=true;
                        }
                    }
                    else if(high==low){
                        if(check[low]!=true)
                            check[low]=true;
                    }
                    else {
                        for (int j = low; j <= high; j++) {
                            if (check[j] != true)
                                check[j] = true;
                        }
                    }
                }
                for(int i =0; i<check.length; i++){
                    if(check[i]==true)
                        aws+=1;
                }
                System.out.println(aws);
            }
        }
    }
}
