package Programmers.Practice_Algorithm.DFS_BFS;

import java.util.LinkedList;

public class Node {
   private int num;
   private LinkedList<Integer> adj[];

    public Node() { }

    public Node(int num) {
        this.num = num;
        adj = new LinkedList[num];
       // for(int i=0;)
    }
}
