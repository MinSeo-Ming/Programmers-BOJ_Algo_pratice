package Na_code.datastruct;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String args[]){
        int size = 9;
        bfsG b = new bfsG(size);
        b.put(1,2);
        b.put(1,3);
        b.put(1,8);
        b.put(2,7);
        b.put(3,4);
        b.put(3,5);
        b.put(4,5);
        b.put(6,7);
        b.put(7,8);
        b.print();
        System.out.println();
        System.out.print("정점 1부터 탐색");
        b.bfs(1);

        System.out.println();
        System.out.print("정점 2부터 탐색");
        b.clearVisited();
        b.bfs(2);

        System.out.println();
        System.out.print("정점 3부터 탐색");
        b.clearVisited();
        b.bfs(3);
        System.out.println();
        System.out.print("정점 4부터 탐색");
        b.clearVisited();
        b.bfs(4);
        System.out.println();
        System.out.print("정점 5부터 탐색");
        b.clearVisited();
        b.bfs(5);
        System.out.println();
        System.out.print("정점 6부터 탐색");

        b.clearVisited();
        b.bfs(6);
        System.out.println();
        System.out.print("정점 7부터 탐색");
        b.clearVisited();
        b.bfs(7);
        System.out.println();
        System.out.print("정점 8부터 탐색");
        b.clearVisited();
        b.bfs(8);
    }
}
class bfsG{
    private int Node;
    private ArrayList<ArrayList<Integer>> Graph;
    private boolean visited [];
    private Queue<Integer> queue;
    public bfsG() {

    }
    public bfsG(int size){
        this.Node = size;
        Graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<this.Node; i++)
            Graph.add(new ArrayList<Integer>());
        this.visited = new boolean[this.Node];
        this.queue = new LinkedList<>();
    }
    public ArrayList<Integer> getNode(int idx) {
        return this.Graph.get(idx);
    }
    public ArrayList<ArrayList<Integer>> getGraph(){
        return this.Graph;
    }
    public void put(int x, int y){
        this.Graph.get(x).add(y);
        this.Graph.get(y).add(x);
    }
    public void print(){
        for(int i=0; i<this.Node; i++){
            System.out.print("Node "+i+"의 인접 리스트");
            for(int j: this.Graph.get(i))
                System.out.print(" -> "+j);
            System.out.println();
        }
    }
    public void clearVisited(){
        for(int i=0; i<this.Node; i++)
            this.visited[i]= false;
    }

    public void bfs(int start){
        this.queue.add(start);
        this.visited[start]= true;
        while (!queue.isEmpty()){
            int v = queue.poll();
            System.out.print(v+ " ");
            for(int i: this.Graph.get(v)){
                if(visited[i]==false){
                    queue.add(i);
                    this.visited[i]=true;
                }
            }
        }
    }
}
