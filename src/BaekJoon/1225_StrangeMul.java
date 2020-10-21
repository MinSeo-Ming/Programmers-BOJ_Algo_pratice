import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String fir = st.nextToken();
        String sec = st.nextToken();
        
        String fir_num[]=fir.split("");
        String sec_num[]=sec.split("");
        int n = fir_num.length;
        int m = sec_num.length;
        long sumA=0,sumB=0;
        for(int i = 0 ; i < n ; i++){
            sumA+=Integer.parseInt(fir_num[i]);
        }
        for(int i = 0 ; i < m ; i++){
            sumB+=Integer.parseInt(sec_num[i]);
        }
        
        long result = sumA*sumB;
        System.out.println(result);
    }    
}
