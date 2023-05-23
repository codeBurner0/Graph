package ImplementationOfGraph;
import java.util.Scanner;

public class AdjacentMatrix {
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
        // PRINT ADJACENT MATRIX
        for(int i=0;i<adj_mat.length;i++){
            for(int j=0;j<adj_mat[0].length;j++){
                System.out.print(adj_mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        
    }
    public static boolean hasEdge(int[][] arr,int s,int v) {
        if(arr[s][v]==1){
            return true;
        }
        return false;
    }
    public static void removeEdge(int[][] arr,int s,int v) {
        arr[s][v]=0;
        System.out.println("Edge is removed");
    }
}
