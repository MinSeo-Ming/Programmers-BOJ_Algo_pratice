package Na_code.datastruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DFS {
    public static void main(String args[]) {
        int size = 9;
        dfsG d = new dfsG(size);
        d.put(1,2);
        d.put(1,3);
        d.put(1,8);
        d.put(2,7);
        d.put(3,4);
        d.put(3,5);
        d.put(4,5);
        d.put(6,7);
        d.put(7,8);
        d.print();
        System.out.println();
        System.out.print("정점 1부터 탐색");
        d.dfs(1);

        System.out.println();
        System.out.print("정점 2부터 탐색");
        d.clearVisited();
        d.dfs(2);

        System.out.println();
        System.out.print("정점 3부터 탐색");
        d.clearVisited();
        d.dfs(3);
        System.out.println();
        System.out.print("정점 4부터 탐색");
        d.clearVisited();
        d.dfs(4);
        System.out.println();
        System.out.print("정점 5부터 탐색");
        d.clearVisited();
        d.dfs(5);
        System.out.println();
        System.out.print("정점 6부터 탐색");

        d.clearVisited();
        d.dfs(6);
        System.out.println();
        System.out.print("정점 7부터 탐색");
        d.clearVisited();
        d.dfs(7);
        System.out.println();
        System.out.print("정점 8부터 탐색");
        d.clearVisited();
        d.dfs(8);
    }
}
class dfsG{
    private int Node;
    private ArrayList<ArrayList<Integer>> Graph;
    private boolean visited [];

    public dfsG(int node){
        this.Node = node;
        this.Graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<this.Node; i++)
            Graph.add(new ArrayList<Integer>());
        this.visited = new boolean[this.Node];
    }

    public ArrayList<ArrayList<Integer>> getNode() {
        return this.Graph;
    }
    public ArrayList<Integer> getNode(int i){
        return this.Graph.get(i);
    }

    public ArrayList<ArrayList<Integer>> getGraph() {
        return Graph;
    }

    public void put(int x, int y){
        Graph.get(x).add(y);
        Graph.get(y).add(x);
    }
    public void print(){
        for(int i=1; i<Graph.size(); i++){
            System.out.print("Node "+i+"의 인접리스트");
            for(int j =0; j<Graph.get(i).size(); j++){
                System.out.print(" -> "+ Graph.get(i).get(j));
            }
            System.out.println();
        }
    }
    public void clearVisited(){
        for(int i=0; i<this.visited.length; i++)
            visited[i]=false;
    }
    public void dfs(int idx){
        this.visited[idx] =true;
        System.out.print(idx+" -> ");
        for(int i : this.Graph.get(idx)){
            if(this.visited[i]==false)
                dfs(i);
        }
    }
}
