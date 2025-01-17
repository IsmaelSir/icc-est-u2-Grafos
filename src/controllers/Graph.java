package controllers;

import java.util.ArrayList;
import java.util.List;

import controllers.models.NodeG;

public class Graph {
    private List<NodeG> nodes;  

    public Graph() {
        this.nodes = new ArrayList<>();  
    }

    public NodeG addNode(int value) {
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);  
        return newNode;  
    }

    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest); 
        dest.addNeighbor(src);  
    }

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

