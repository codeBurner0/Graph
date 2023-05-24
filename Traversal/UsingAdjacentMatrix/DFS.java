package Traversal.UsingAdjacentMatrix;

import java.util.Scanner;
import java.util.Stack;

public class DFS {
    public static void dfs(int arr[][],int s) {
        int v=arr.length;
        Stack<Integer> q=new Stack<>();
        boolean visited[]=new boolean[v];
        q.push(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int n=q.pop();
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
        dfs(adj_mat, 0);
    }
}
