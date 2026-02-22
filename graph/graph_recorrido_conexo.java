package introductoryProblems.grafitos;

import java.util.*;

public class graph_recorrido_conexo  {

    static int n = 6; // nodos 0 a 5
    static List<Integer>[] adj;
    static boolean[] visited;

    public static void main(String[] args) {

        adj = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Componente 1
        addEdge(0, 1);
        addEdge(1, 2);

        addEdge(2 , 3);
        addEdge(3, 4);
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]== false) {
                components++;
                dfs(i);
            }
        }

        System.out.println("\nTotal componentes: " + components);
    }

    static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static void dfs(int node) {
        visited[node] = true;

        for (int neighbor : adj[node]) {
            if (visited[neighbor] == false) {
                dfs(neighbor);
            }
        }
    }
}