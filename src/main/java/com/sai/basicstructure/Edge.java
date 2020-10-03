package com.sai.basicstructure;
import java.util.Objects;

public class Edge {
    private String vertex;
    private int weight;

    public Edge(String vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    public String getVertex() {
        return vertex;
    }

    public void setVertex(String vertex) {
        this.vertex = vertex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return weight == edge.weight &&
                Objects.equals(vertex, edge.vertex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vertex, weight);
    }
}
