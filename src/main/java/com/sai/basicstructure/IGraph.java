package com.sai.basicstructure;

import java.util.ArrayList;

public interface IGraph {
    public void addVertex(String vertex);
    public ArrayList<String> getVertices();
    public void addEdge(String source, String target,int weight);
    public void removeEdge(String source, String target,int weight);
    public int size();
    public ArrayList<Edge> getAdjacentList(String vertex);
}
