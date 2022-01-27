/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphalgs;

/**
 *
 * @author elton.chen
 */
public class GraphAlgs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,2);
        g.addEdge(1,4);
        g.addEdge(2,1);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(4,2);
        g.addEdge(4,0);
        g.addEdge(4,3);
        Graph.printGraph(g);
        g.iterDFS(4);
        g.reDFS(4);
    }
    
}
