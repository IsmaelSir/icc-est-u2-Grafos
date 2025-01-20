import controllers.Graph;
import controllers.models.NodeG;

public class App {
    public static void main(String[] args) throws Exception {
        //runGraph();
        EjercicioGrafo();
    }
    public static void runGraph(){
        Graph grafo = new Graph();
        /*NodeG node5 =grafo.addNode(5);
        NodeG node7 = grafo.addNode(7);
        NodeG node9 = grafo.addNode(9);
        NodeG node11 = grafo.addNode(11);
        NodeG node3 = grafo.addNode(3);

        grafo.addEdge(node5,node7);
        grafo.addEdge(node5, node3);
        grafo.addEdge(node5, node9);
        grafo.addEdge(node7, node9);
        grafo.addEdge(node3, node11);
        grafo.addEdge(node3, node9);
        grafo.printGraph();*/

        NodeG node0 = grafo.addNode(0);
        NodeG node1 = grafo.addNode(1);
        NodeG node2 = grafo.addNode(2);
        NodeG node3 = grafo.addNode(3);
        NodeG node4 = grafo.addNode(4);
        NodeG node5 = grafo.addNode(5);

        grafo.addEdgeUni(node0, node3);
        grafo.addEdgeUni(node0, node5);
        grafo.addEdgeUni(node3, node2);
        grafo.addEdgeUni(node3, node4);
        grafo.addEdgeUni(node4, node1);
        grafo.addEdgeUni(node2, node1);
        grafo.addEdgeUni(node1, node0);
        grafo.printGraph();
        // Recorrido por DFS
        grafo.getDFS(node0);
        // Recorrido por BFS
        grafo.getBDF(node0);

        grafo.addEdge(node0, node3);
        grafo.addEdge(node0, node5);
        grafo.addEdge(node3, node2);
        grafo.addEdge(node3, node4);
        grafo.addEdge(node4, node1);
        grafo.addEdge(node2, node1);
        grafo.addEdge(node1, node0);
        System.out.println("\nNo direccional");
        // Recorrido por DFS
        grafo.getDFS(node0);
        // Recorrido por BFS
        grafo.getBDF(node0);
    }

    public static void EjercicioGrafo(){
        Graph grafo = new Graph();
        NodeG node0 = grafo.addNode(0);
        NodeG node1 = grafo.addNode(1);
        NodeG node2 = grafo.addNode(2);
        NodeG node3 = grafo.addNode(3);
        NodeG node4 = grafo.addNode(4);
        NodeG node5 = grafo.addNode(5);
        NodeG node7 = grafo.addNode(7);
        NodeG node8 = grafo.addNode(8);
        NodeG node9 = grafo.addNode(9);

        grafo.addEdge(node0, node1);
        grafo.addEdge(node0, node3);
        grafo.addEdge(node0, node5);
        grafo.addEdge(node1, node0);
        grafo.addEdge(node1, node2);
        grafo.addEdge(node1, node4);
        grafo.addEdge(node1, node8);
        grafo.addEdge(node3, node0);
        grafo.addEdge(node3, node2);
        grafo.addEdge(node3, node4);
        grafo.addEdge(node3, node7);
        grafo.addEdge(node3, node9);
        grafo.addEdge(node4, node1);
        grafo.addEdge(node4, node3);
        grafo.addEdge(node5, node0);
        grafo.addEdge(node7, node3);
        grafo.addEdge(node7, node8);
        grafo.addEdge(node8, node1);
        grafo.addEdge(node8, node7);

        grafo.printGraph();
        grafo.getDFS(node0);
    }

}
