/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphalgs;
import java.util.*;

/**
 *
 * @author elton.chen
 */
public class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;
    boolean[] visited;
    
    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge (int v1, int v2) {
        //Directed graph
        adjList[v1].add(v2);
        // For an undirected graph, also add v1 to v2's list
    }
    static public void printGraph (Graph g) {
        for (int i = 0; i < g.vertices; i++) {
            LinkedList neigbours = g.adjList[i];
            System.out.print(Integer.toString(i) + ": ");
            System.out.println(neigbours);
        }
    }
    
    public void iterDFS (int start) {
       Stack<Integer> stack = new Stack<>();
       stack.add(start);
       visited = new boolean[vertices]; //All false
       visited[start] = true;
       while (!stack.isEmpty()) {
           int current = stack.pop();
           
           for (int neighbour: adjList[current]) {
               if (!visited[neighbour]) {
                   stack.push(neighbour);
                   visited[neighbour] = true;
               }
           }
       }
    }
    
    private void search(int v) {
        System.out.print("Node: ");
        System.out.println(v);
        System.out.print("Neigbours: ");
        System.out.println(adjList[v]);
        for (int neighbour: adjList[v]) {
            if (!visited[neighbour]) {
                visited[neighbour] = true;
                search(neighbour);
            }
        }
    }
    
    public void reDFS (int start) {
        visited = new boolean[vertices];
        visited[start] = true;
        search(start);
    }
            
}
