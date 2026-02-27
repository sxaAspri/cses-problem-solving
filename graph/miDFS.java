package graph;
import java.util.*;

public class miDFS {

    static List<Integer>[] adj;
    static boolean[] visited;
    static int n = 5;

    public static void main(String[] args) {

        adj = new ArrayList[n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Agregamos aristas
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(3, 4);

        dfs(0);
    }

    static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // quitar si es dirigido
    }

    static void dfs(int node) {

        visited[node] = true;
        System.out.println(node);

        for(int neighbor : adj[node]) {

            if(!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}