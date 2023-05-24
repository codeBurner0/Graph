package Traversal.UsingAdjacencyList;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class dfs {
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
        boolean visited[]=new boolean[v+1];
        for(int i=0;i<=v;i++){
            if(!visited[i]){
                dfsTraversal(al,i,visited);
            }
        }
        sc.close();
    }
    private static void dfsTraversal(ArrayList<ArrayList<Integer>> al, int s,boolean visited[]) {
        visited[s]=true;
        Stack<Integer> stack=new Stack<>();
        stack.push(s);
        while(stack.size()>0){
            int v=stack.pop();
            System.out.print(v+" ");
            for(int ver:al.get(v)){
                if(!visited[ver]){
                    visited[ver]=true;
                    stack.push(ver);
                }
            }
        }
    }
    private static void addEdge(ArrayList<ArrayList<Integer>> al,int si, int ei) {
        al.get(si).add(ei);
        // al.get(ei).add(si);
    }
}
