package sorting ; 
import java.io.*;
import java.util.*;

public class restaurant_customer_pointer {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arrival = new int[n];
        int[] departure = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrival[i] = Integer.parseInt(st.nextToken());
            departure[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int i = 0, j = 0;
        int current = 0;
        int max = 0;

        while (i < n && j < n) {
            if (arrival[i] < departure[j]) {
                current++;
                max = Math.max(max, current);
                i++;
            } else {
                current--;
                j++;
            }
        }

        System.out.println(max);
    }
}