package controllers.models;

import java.util.ArrayList;
import java.util.List;

public class NodeG {
    private int value;
    private List<NodeG> neighbors; 

    public NodeG(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();  
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public List<NodeG> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<NodeG> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbor(NodeG neighbor) {
        this.neighbors.add(neighbor);
    }
}
