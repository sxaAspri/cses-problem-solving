package graph;
import java.io.*;
import java.util.*;

public class coutingRooms {

    static int n, m;
    static char[][] grid;
    static boolean[][] visited;

    // Movimientos: arriba, abajo, izquierda, derecha
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        grid = new char[n][m];
        visited = new boolean[n][m];

        // Leer mapa
        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        int rooms = 0;

        // Recorrer toda la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Si es piso y no lo hemos visitado
                if (grid[i][j] == '.' && !visited[i][j]) {
                    rooms++;        // Encontramos nuevo cuarto
                    dfs(i, j);      // Exploramos todo el cuarto
                }
            }
        }

        System.out.println(rooms);
    }

    static void dfs(int x, int y) {

        visited[x][y] = true;

        // Intentar moverse en las 4 direcciones
        for (int d = 0; d < 4; d++) {

            int nx = x + dx[d];
            int ny = y + dy[d];

            // Verificar límites
            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {

                // Si es piso y no visitado
                if (grid[nx][ny] == '.' && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
