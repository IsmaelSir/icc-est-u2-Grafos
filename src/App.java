import controllers.Graph;

public class App {
    public static void main(String[] args) throws Exception {
       runGraph();
    }
    public static void runGraph(){
        Graph grafo = new Graph();
        grafo.addNode(5);
        grafo.addNode(7);
        grafo.addNode(9);
        grafo.addNode(11);
        grafo.addNode(3);

        grafo.addEdge(grafo.addNode(5), grafo.addNode(7));
        grafo.addEdge(grafo.addNode(5), grafo.addNode(3));
        grafo.addEdge(grafo.addNode(5), grafo.addNode(9));
        grafo.addEdge(grafo.addNode(7), grafo.addNode(9));
        grafo.addEdge(grafo.addNode(3), grafo.addNode(9));
        grafo.addEdge(grafo.addNode(3), grafo.addNode(11));
        grafo.printGraph();
    }
}
