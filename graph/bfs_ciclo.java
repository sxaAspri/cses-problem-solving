package graph;


import java.util.*;

public class bfs_ciclo {

    static int n = 4;
    static List<Integer>[] adj;
    static boolean[] visited;

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

        boolean hasCycle = false;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (bfsCycle(i)) {
                    hasCycle = true;
                    break;
                }
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

    static boolean bfsCycle(int start) {

        Queue<int[]> queue = new LinkedList<>();
        visited[start] = true;

        // guardamos: {nodo, padre}
        queue.add(new int[]{start, -1});

        while (!queue.isEmpty()) {

            int[] current = queue.poll();
            int node = current[0];
            int parent = current[1];

            for (int neighbor : adj[node]) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new int[]{neighbor, node});
                }
                else if (neighbor != parent) {
                    return true; // ciclo encontrado
                }
            }
        }

        return false;
    }
}