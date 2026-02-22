package sorting;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class restaurant_customer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        

        for (int i = 0; i < n; i++) {
        st = new StringTokenizer(br.readLine());
        int llegada = Integer.parseInt(st.nextToken());
        int salida = Integer.parseInt(st.nextToken());

        // llegada: +1
        map.put(llegada, map.getOrDefault(llegada, 0) + 1);

        // salida: -1
        map.put(salida, map.getOrDefault(salida, 0) - 1);
        }
        int current = 0;
        int max = 0;

        for (int change : map.values()) {
        current += change;
        max = Math.max(max, current);
        }

        System.out.println(max);
    

        
    }

    
}
