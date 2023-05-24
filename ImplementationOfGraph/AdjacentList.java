package ImplementationOfGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacentList {
    
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
        printList(al);
        sc.close();
    }

    private static void printList(ArrayList<ArrayList<Integer>> al) {
        for(int i=0;i<al.size();i++){
            System.out.print(i+"-->");
            for(int j=0;j<al.get(i).size();j++){
                System.out.print(al.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> al,int si, int ei) {
        al.get(si).add(ei);
        // al.get(ei).add(si);
    }
}


