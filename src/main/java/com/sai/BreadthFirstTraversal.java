package com.sai;

import com.sai.basicstructure.Edge;
import com.sai.basicstructure.IGraph;

import java.util.*;

public class BreadthFirstTraversal {
    public Set<String> breadthFirstTraversal(IGraph graph, String source) {
        Set<String> visitedVertices = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            String removedVertex = queue.poll();
            visitedVertices.add(removedVertex);
            ArrayList<Edge> adjacentList = graph.getAdjacentList(removedVertex);
            for (Edge edge : adjacentList) {
                String adjVertex = edge.getVertex();
                if (!visitedVertices.contains(adjVertex))
                    queue.offer(adjVertex);
            }
        }
        return visitedVertices;
    }
}
