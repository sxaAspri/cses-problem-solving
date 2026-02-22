package sorting;
import java.io.*;
import java.util.*;

public class concert_tickets_ultra {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tickets = Integer.parseInt(st.nextToken());
        int customers = Integer.parseInt(st.nextToken());

        TreeMap<Integer, Integer> map = new TreeMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tickets; i++) {
            int price = Integer.parseInt(st.nextToken());
            map.put(price, map.getOrDefault(price, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < customers; i++) {
            int money = Integer.parseInt(st.nextToken());

            Integer ticket = map.floorKey(money);

            if (ticket == null) {
                sb.append(-1).append('\n');
            } else {
                sb.append(ticket).append('\n');
                map.put(ticket, map.get(ticket) - 1);
                if (map.get(ticket) == 0)
                    map.remove(ticket);
            }
        }

        System.out.print(sb);
    }
}
