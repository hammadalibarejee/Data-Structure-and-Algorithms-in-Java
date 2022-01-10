/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph;

/**
 *
 * @author Hammad Ali
 */
public class Graph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph<String, DefaultEdge> g 
  = new SimpleGraph<>(DefaultEdge.class);
    g.addVertex(“v1”);
g.addVertex(“v2”);
g.addEdge(v1, v2);
    }
    
}
