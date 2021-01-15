package baek;

import java.io.*;
import java.util.*;

public class BFS_DFS_1260 {
    private static ArrayList<ArrayList<Integer>> list;
    private static boolean check[];
    private static Queue<Integer>queue;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s= br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        queue = new LinkedList<>();
        check = new boolean[node+1];
        list = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=node; i++)
            list.add(new ArrayList<Integer>());
        for(int i=0; i<edge; i++){
            s=br.readLine();
            st= new StringTokenizer(s);
            int ss = Integer.parseInt(st.nextToken());
            int ed = Integer.parseInt(st.nextToken());
            list.get(ss).add(ed);
            list.get(ed).add(ss);
        }
        for(ArrayList<Integer> i : list){
            Collections.sort(i);
        }
        dfs(start);
        System.out.println();
        check = new boolean[node+1];
        bfs(start);
    }
    static void dfs(int x){
        check[x]=true;
        System.out.print(x+" ");
        for(int i: list.get(x)){
            if(check[i]==false)
                dfs(i);
        }
    }
    static void bfs(int x){
        queue.add(x);
        check[x]=true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            System.out.print(temp+" ");
            for(int i :list.get(temp)){
                if(check[i]==false){
                    queue.add(i);
                    check[i]=true;
                }
            }
        }
    }
}
