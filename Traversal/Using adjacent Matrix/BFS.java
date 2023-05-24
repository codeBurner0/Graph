package Traversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void bfs(int arr[][],int s) {
        int v=arr.length;
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[v];
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int n=q.poll();
            System.out.print(n+" ");
            for(int i=0;i<v;i++){
                if(arr[n][i]==1 && visited[i]==false){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        System.out.println("Enter edges");
        int adj_mat[][]=new int[v][v];
        for(int i=0;i<e;i++){
            int sv=sc.nextInt();
            int ev=sc.nextInt();
            adj_mat[sv][ev]=1;
            adj_mat[ev][sv]=1;
        }
        bfs(adj_mat, 0);
    }
}
