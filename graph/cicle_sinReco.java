package graph;

import java.util.*;

public class cicle_sinReco {

    static int n = 4;
    static List<Integer>[] adj;
    static boolean[] visited;
    static boolean hasCycle = false;

    public static void main(String[] args) {

        adj = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Grafo con ciclo
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfsCycle(i, -1);
            }
        }

        if (hasCycle)
            System.out.println("El grafo tiene ciclo");
        else
            System.out.println("No tiene ciclo");
    }

    static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static void dfsCycle(int node, int par) {

        visited[node] = true;

        for (int neighbor : adj[node]) {

            if (!visited[neighbor]) {
                dfsCycle(neighbor, node);
            }
            else if (neighbor != par) {
                hasCycle = true;
            }
        }
    }
}