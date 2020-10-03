package com.sai;

import com.sai.basicstructure.GraphAdjListImpl;
import com.sai.basicstructure.IGraph;

public class graphTesting {
    public static void main(String[] args) {
        IGraph graph=new GraphAdjListImpl();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C", 2);
        graph.addEdge("A", "F", 2);
        graph.addEdge("B", "D", 7);
        graph.addEdge("D", "F", 1);
        graph.addEdge("C", "E", 6);
        graph.addEdge("E", "G", 5);
        graph.addEdge("G", "F", 4);
        graph.addEdge("B", "E", 1);
        BreadthFirstTraversal bfs=new BreadthFirstTraversal();
        System.out.println(bfs.breadthFirstTraversal(graph,"A"));

    }
}
