package com.sai;

import com.sai.basicstructure.Edge;
import com.sai.basicstructure.IGraph;

import java.util.*;

public class BreadthFirstTraversal {
    public Set<String> breadthFirstTraversal(IGraph graph, String source) {
        Set<String> visitedVertices = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList();
        queue.add(source);
        while (!queue.isEmpty()) {
            String removedNode = queue.remove();
            visitedVertices.add(removedNode);
            for (Edge edge : graph.getAdjacentList(removedNode)) {
                if (!visitedVertices.contains(edge.getVertex()))
                    queue.add(edge.getVertex());
            }
        }
        return visitedVertices;
    }
}
