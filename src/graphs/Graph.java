package graphs;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // If undirected graph
    }

    public List<Integer> getNeighbors(int v) {
        return adjList.getOrDefault(v, new ArrayList<>());
    }

    public void printGraph() {
        for (int v : adjList.keySet()) {
            System.out.println(v + " → " + adjList.get(v));
        }
    }
}
