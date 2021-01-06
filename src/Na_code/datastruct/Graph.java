package Na_code.datastruct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Graph {
    public static void main(String args[]){
        int size = 9;
        ListGraph l = new ListGraph(size);
        l.put(1,2);
        l.put(1,3);
        l.put(1,8);
        l.put(2,7);
        l.put(3,4);
        l.put(3,5);
        l.put(4,5);
        l.put(6,7);
        l.put(7,8);
        l.print();
    }
}
class ListGraph{
    private ArrayList<ArrayList<Integer>> listGraph;
    //그래프 초기화
    public ListGraph(int initSize){
        this.listGraph = new ArrayList<ArrayList<Integer>>();
        for(int i =0; i<initSize; i++){
            listGraph.add(new ArrayList<Integer>());
        }
    }
    public ArrayList<ArrayList<Integer>> getListGraph(){
        return this.listGraph;
    }
    public void put(int x, int y){
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }
    public void putSingle(int x, int y){
        listGraph.get(x).add(y);
    }
    public void print(){
        for(int i=1; i<listGraph.size(); i++){
            System.out.print("Node "+i+"의 인접리스트");
            for(int j =0; j<listGraph.get(i).size(); j++){
                System.out.print(" -> "+ listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
