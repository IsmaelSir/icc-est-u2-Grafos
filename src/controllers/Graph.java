package controllers;

import java.util.ArrayList;
import java.util.List;

import controllers.models.NodeG;

public class Graph {
    private List<NodeG> nodes;  

    //Constructor
    public Graph() {
        this.nodes = new ArrayList<>();  
    }
    
    //Metodo para añidir un nodo
    public NodeG addNode(int value) {
        NodeG nodeGraph = new NodeG(value);
        nodes.add(nodeGraph);  
        return nodeGraph;  
    }

    //Metodo para añidir una arista
    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest); 
        dest.addNeighbor(src);  
    }

    //Metodo para imprimir el grafo
    public void printGraph() {
        for (NodeG node : nodes) {
            System.out.print("Nodo " + node.getValue() + " tiene vecinos: ");
            List<NodeG> neighbors = node.getNeighbors();
            for (NodeG neighbor : neighbors) {
                System.out.print(neighbor.getValue() + " ");
            }
            System.out.println(); 
        }
    }
}

