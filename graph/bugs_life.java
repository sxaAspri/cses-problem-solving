package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class bugs_life {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); // número de escenarios

        for (int scenario = 1; scenario <= T; scenario++) {

            boolean suspicious = false;

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            List<Integer>[] adj = new ArrayList[n + 1];

            for (int i = 1; i <= n; i++) {
                adj[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                adj[a].add(b);
                adj[b].add(a);
            }

            int[] color = new int[n + 1];
            Arrays.fill(color, -1); 

            for (int i = 1; i <= n; i++) {

                if (color[i] == -1) {

                    Queue<Integer> queue = new LinkedList<>();
                    color[i] = 0; 
                    queue.add(i);
                    while (!queue.isEmpty()) {

                        int current = queue.poll();

                        for (int neighbor : adj[current]) {
                            if (color[neighbor] == -1) {
                                if (color[current] == 0) {
                                    color[neighbor] = 1;
                                } else {
                                    color[neighbor] = 0;
                                }
                                queue.add(neighbor);
                            }

                            else if (color[neighbor] == color[current]) {
                                suspicious = true;
                                break;
                            }
                        }

                        if (suspicious) break;
                    }
                }

                if (suspicious) break;
            }

            
            System.out.println("Scenario #" + scenario + ":");

            if (suspicious) {
                System.out.println("Suspicious bugs found!");
            } else {
                System.out.println("No suspicious bugs found!");
            }
        }
    }
}