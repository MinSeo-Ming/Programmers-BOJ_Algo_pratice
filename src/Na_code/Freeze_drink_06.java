package Na_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Freeze_drink_06 {
    static ArrayList<ArrayList<String>> graph;
    static int n,m;
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList<ArrayList<String>>();
        for(int i=0;i<n; i++){
            ArrayList<String> line = new ArrayList<>();
            s = br.readLine();
            String [] temp = s.split("");

            for(int j =0; j< temp.length;j++) {
                line.add(temp[j]);
            }
            graph.add(line);
        }
        int result =0;
        for(int i=0; i<n; i++){
            for(int j =0; j<m; j++){
                if(dfs(i,j)==true)
                    result+=1;
            }
        }
        System.out.println(result);
    }
    static boolean dfs(int x, int y){
        if(x<= -1 ||x>=n||y<=-1||y>=m)
            return false;
        if(graph.get(x).get(y).contentEquals("0")){
            graph.get(x).set(y,"1");
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y+1);
            dfs(x,y-1);
            return true;
        }
        return false;
    }
}
