package sorting;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class concert_tickets {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tickets = Integer.parseInt(st.nextToken());
        int customers = Integer.parseInt(st.nextToken());
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tickets; i++) {
            int price = Integer.parseInt(st.nextToken());
            if (map.containsKey(price)) {
            map.put(price, map.get(price) + 1);
            } else {
            map.put(price, 1);
}
            
            //getOrDefault(price, 0)+1 hace lo mismo pero mas corto : 
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < customers; i++) {
            int money = Integer.parseInt(st.nextToken());

        Integer ticket = map.floorKey(money);

        if (ticket == null) {
                
                System.out.println(-1);
            } else {
                
                System.out.println(ticket);


                int count = map.get(ticket);
                if (count == 1) {
                    map.remove(ticket);
                } else {
                    map.put(ticket, count - 1);
                }



    }
}}}
