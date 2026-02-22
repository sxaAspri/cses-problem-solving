package introductoryProblems.grafitos;
import java.util.*;

public class miBFS {

    static List<Integer>[] adj;
    static boolean[] visited;
    static int n = 8;

    public static void main(String[] args) {

        adj = new ArrayList[n];
        visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Agregamos aristas
        addEdge(0, 7);
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 0);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 0);
        addEdge(2, 5);
        addEdge(2, 6);
        addEdge(3, 1);
        addEdge(4, 1);
        addEdge(5, 2);
        addEdge(6, 2);
        addEdge(7, 0);

        bfs(0);
    }

    static void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u); // quitar si es dirigido
    }

    static void bfs(int start) {

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {

            int node = queue.poll();
            System.out.println(node);

            for(int neighbor : adj[node]) {

                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
