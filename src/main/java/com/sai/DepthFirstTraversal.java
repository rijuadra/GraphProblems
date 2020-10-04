package com.sai;

import com.sai.basicstructure.Edge;
import com.sai.basicstructure.IGraph;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DepthFirstTraversal {
    public Set<String> depthFirstTraversal(IGraph graph, String source) {
        Set<String> visitedVertices = new LinkedHashSet<>();
        Stack<String> stack=new Stack<>();
        stack.push(source);
        while(!stack.empty()){
            String removedVertex = stack.pop();
            visitedVertices.add(removedVertex);
            List<Edge> adjList=graph.getAdjacentList(removedVertex);
            for(Edge edge:adjList){
                stack.push(edge.getVertex());
            }

        }
        return visitedVertices;
    }
}
