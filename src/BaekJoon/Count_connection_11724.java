package baek;

import java.util.*;

public class Count_connection_11724 {
    private static ArrayList<ArrayList<Integer>> graph;
    private static boolean visited [];

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        graph = new ArrayList<ArrayList<Integer>>();
        int N = sc.nextInt();
        int E = sc.nextInt();
        visited = new boolean[N+1];
        int count =0;

        for(int i=0; i<N+1; i++)
            graph.add(new ArrayList<Integer>());
        for(int i=0; i<E; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        sc.close();
        for(int i=1; i<=N; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);


    }
    static void dfs(int start){
        visited[start] =true;
        for(int i: graph.get(start)){
            if(visited[i] ==false)
                dfs(i);
        }
    }
}
