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
        graph.addVertex("H");
        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C", 2);
        graph.addEdge("A", "D", 2);
        graph.addEdge("B", "E", 7);
        graph.addEdge("C", "F", 1);
        graph.addEdge("D", "H", 6);
        graph.addEdge("E", "G", 5);
        graph.addEdge("F", "G", 4);
        graph.addEdge("H", "G", 1);
        BreadthFirstTraversal bfs=new BreadthFirstTraversal();
        System.out.println(bfs.breadthFirstTraversal(graph,"A"));
        DepthFirstTraversal dfs=new DepthFirstTraversal();
        System.out.println(dfs.depthFirstTraversal(graph,"A"));

    }
}
