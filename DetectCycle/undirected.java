package DetectCycle;

import java.util.ArrayList;
import java.util.Scanner;

public class undirected {
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
        for(int i=0;i<v;i++){
            if(!visited[i]){
                System.out.println(detectCycle(al, i,visited,-1));
            }
        }
        sc.close();
    }
    
    private static boolean detectCycle(ArrayList<ArrayList<Integer>> al, int s,boolean[] visited,int parent) {
        visited[s]=true;
        for(int v:al.get(s)){
            if(!visited[v] && detectCycle(al,v,visited,s)){
                return true;
            }else if(parent!=s){
                return true;
            }
        }
        return false;
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> al,int si, int ei) {
        al.get(si).add(ei);
        al.get(ei).add(si);
    }
}
