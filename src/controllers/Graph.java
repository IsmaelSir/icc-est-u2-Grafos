package controllers;

import controllers.models.NodeG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

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
                System.out.print(neighbor.getValue() + " - ");
            }
            System.out.println();
        }
    }

    public void addEdgeUni(NodeG node0, NodeG node1 ){
        node0.addNeighbor(node1);
    }

    public void getDFS(NodeG start){
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el node "+ start.getValue()+ " :");
        getDFSUtil(start, visitados);
        System.out.println();
    }
    private void getDFSUtil(NodeG node, Set<NodeG> visitados){
        if(visitados.contains(node)){
            return;
        }
        System.out.print(node.getValue()+ " ");
        visitados.add(node);
        for (NodeG neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visitados);
        }
    }

    public void getBDF(NodeG start){
        Set<NodeG> visitados = new HashSet<>();
        Queue<NodeG> cola = new LinkedList<>();

        System.out.println("BDF desde el node "+start.getValue()+" :");
        cola.add(start);
        visitados.add(start);

        while(!cola.isEmpty()){
            NodeG actual = cola.poll();
            System.out.print(actual.getValue()+ " ");

            for(NodeG neighbor : actual.getNeighbors()){
                if(!visitados.contains(neighbor)){
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
        }
    }
}

