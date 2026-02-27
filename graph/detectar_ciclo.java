package graph;

import java.util.*;

public class detectar_ciclo {

    static int n = 4;
    static List<Integer>[] adj;
    static boolean[] visited;
    static int[] parent;
    static boolean hasCycle = false;
    static List<Integer> cycle = new ArrayList<>();

    public static void main(String[] args) {

        adj = new ArrayList[n];
        visited = new boolean[n];
        parent = new int[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            parent[i] = -1;
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

        if (hasCycle) {
            System.out.println("Ciclo encontrado:");
            for (int node : cycle) {
                System.out.print(node + " ");
            }
        } else {
            System.out.println("No tiene ciclo");
        }
    }

    static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    static void dfsCycle(int node, int par) {

        visited[node] = true;
        parent[node] = par;

        for (int neighbor : adj[node]) {

            if (!visited[neighbor]) {
                dfsCycle(neighbor, node);
            }
            else if (neighbor != par && !hasCycle) {

                hasCycle = true;

                // reconstruir ciclo
                int current = node;
                cycle.add(neighbor);

                while (current != neighbor) {
                    cycle.add(current);
                    current = parent[current];
                }

                cycle.add(neighbor); // cerrar ciclo
                return;
            }
        }
    }
}