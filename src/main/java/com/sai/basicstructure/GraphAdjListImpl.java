package com.sai.basicstructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GraphAdjListImpl implements IGraph {
    ArrayList<String> vertices = new ArrayList<>();
    Map<String, ArrayList<Edge>> adjList = new HashMap<>();

    @Override
    public void addVertex(String vertex) {
        vertices.add(vertex);
        adjList.put(vertex, new ArrayList<>());
    }

    @Override
    public ArrayList<String> getVertices() {
        return vertices;
    }

    @Override
    public void addEdge(String source, String target, int weight) {
        if(vertices.contains(source)&&vertices.contains(target)) {
            Edge edge = new Edge(target, weight);
            adjList.get(source).add(edge);
        }
    }

    @Override
    public void removeEdge(String source, String target, int weight) {
        if(vertices.contains(source)&&vertices.contains(target)) {
            Edge edge = new Edge(target, weight);
            adjList.get(source).remove(edge);
        }
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public ArrayList<Edge> getAdjacentList(String vertex) {
        return adjList.get(vertex);
    }
}
