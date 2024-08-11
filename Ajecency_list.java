package graph;

import java.util.ArrayList;  
import java.util.List;  

class  Ajecency_list {  
    private int vertices; // Number of vertices  
    private List<Integer>[] adjList; // Array of lists for adjacency  

    // Constructor  
    public  Ajecency_list(int vertices) {  
        this.vertices = vertices;  
        adjList = new ArrayList[vertices]; // Creating an array of lists  
        for (int i = 0; i < vertices; i++) {  
            adjList[i] = new ArrayList<>(); // Initializing each list  
        }  
    }  

    // Add an edge to the graph (undirected)  
    public void addEdge(int source, int destination) {  
        adjList[source].add(destination); // Add destination to the source's list  
        adjList[destination].add(source); // Add source to the destination's list  
    }  

    // Print the graph  
    public void printGraph() {  
        for (int i = 0; i < vertices; i++) {  
            System.out.print("Vertex " + i + ":");  
            for (Integer neighbor : adjList[i]) {  
                System.out.print(" -> " + neighbor);  
            }  
            System.out.println();  
        }  
    }  

    public static void main(String[] args) {  
    	 Ajecency_list graph = new  Ajecency_list(6); // Create a graph with 6 vertices  
        
        graph.addEdge(0, 1);  
        graph.addEdge(0, 2);  
        graph.addEdge(1, 3);  
        graph.addEdge(2, 4);  
        graph.addEdge(3, 4);  
        graph.addEdge(4, 5);  

        graph.printGraph();  
    }  
}