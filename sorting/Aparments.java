package sorting; 
import java.io.*;
import java.util.*;

public class Aparments {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n]; //apli
        int[] b = new int[m]; //apa

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
        int count = 0;

        while (i < n && j < m) {

            // apartamento demasiado pequeño
            if (Math.abs(a[i] - b[j]) <= k) {
            // match
            count++;
            i++;
            j++;
        } else if (b[j] < a[i]) {
        j++;
        } else {
        i++;
}
        }

        System.out.println(count);
    }
}