package Traversal.UsingAdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> al=new ArrayList<>(v);
        for(int i=0;i<=v;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int si=sc.nextInt();
            int ei=sc.nextInt();
            addEdge(al,si,ei);
        }
        for(int i=0;i<=v;i++){
            boolean visited[]=new boolean[v+1];
            if(!visited[i]){
                bfsTraversal(al,0,visited);
            }
        }
        sc.close();
    }
    private static void bfsTraversal(ArrayList<ArrayList<Integer>> al, int s,boolean visited[]) {
        
        visited[s]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int v=q.poll();
            System.out.print(v+" ");
            for(int ver:al.get(v)){
                if(!visited[ver]){
                    visited[ver]=true;
                    bfsTraversal(al, ver, visited);
                }
            }
        }
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> al,int si, int ei) {
        al.get(si).add(ei);
        // al.get(ei).add(si);
    }
}
