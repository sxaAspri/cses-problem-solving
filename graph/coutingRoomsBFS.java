package graph;
import java.io.*;
import java.util.*;

public class coutingRoomsBFS {

    static int n, m; //tamaño de mi grid
    static char[][] grid; // el grid
    static boolean[][] visited; // matriz de visitado del grid

    // Movimientos: arriba, abajo, izquierda, derecha
    static int[] dx = {-1, 1, 0, 0};  // (-1,0)osea el primer par de dx y dy + (1,1)osea mi posicion  = (0,1) 
    static int[] dy = {0, 0, -1, 1};  // me movi arriba ya que reste 1 en el eje x y deje el eje y igual .
    // esto mismo se aplica para cada par de dx y dy y asi consigo moverme sobre los 4 ejes

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new char[n][m]; // grid definido por tamaño
        visited = new boolean[n][m]; // matriz definida por tamaño

        // Leer mapa
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray(); // llenar el grid 
        }

        int rooms = 0; 

        // Recorro toda la matriz 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Si es . y no ha sido visitado 
                if (grid[i][j] == '.' && !visited[i][j]) {
                    rooms++;        // Encontramos nuevo cuarto
                    bfs(i, j);      // aplciamos dfs sobre ese cuarto para recorrer todos los pisos del cuarto encontrado , al terminar
                                    // estaria terminando de recorrer todo ese cuarto y puedo pasar a un nuevo nodo para ver si es otro cuarto 
                }
            }
        }

        System.out.println(rooms);
    }

    static void bfs(int x, int y) {

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[]{x, y});
    visited[x][y] = true;

    while (!q.isEmpty()) {

        int[] current = q.poll();
        int cx = current[0];
        int cy = current[1];

        for (int d = 0; d < 4; d++) {

            int nx = cx + dx[d];
            int ny = cy + dy[d];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {

                if (grid[nx][ny] == '.' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}
}