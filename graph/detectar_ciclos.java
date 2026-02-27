package graph;

import java.util.*;

public class detectar_ciclos {

    static int n = 4; // nodos 0,1,2,3
    static List<Integer>[] adj;
    static boolean[] visited;
    static boolean hasCycle = false;

    public static void main(String[] args) {

        // Inicializar estructuras
        adj = new ArrayList[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Crear grafo con ciclo
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 0); // ← aquí se forma el ciclo
        addEdge(2, 3);

        // Revisar todos los componentes
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
        adj[v].add(u); // no dirigido
    }

    static void dfsCycle(int node, int parent) {

        visited[node] = true;

        for (int neighbor : adj[node]) {

            if (visited[neighbor] == false) {
                dfsCycle(neighbor, node);  
            }
            else if (neighbor != parent) {
                hasCycle = true;
            }
        }

        // recordemos que el primer caso para el grafo dado 
                // es 0 que tiene como vecinos 1 y 2 , pero no tienen parent entones , entra a 0 entonces
                //1 no esta visitado , hace recursion sobre DFSCYCLE pasandole como parametro (1 y su padre 0 )
                // entonces , el vecino es 2 y 0 , pero 0 es padre entonces no cuenta como ciclo y va a 2 , 
                // sigue a dos , dos tiene como padre 1 y vecino 0 , y venga entonces el vecino ya lo habia visitado 
                // y ahi encontre el ciclo 
    }
}