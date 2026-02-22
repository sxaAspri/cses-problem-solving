package sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ferris_wheels {
    public static void main(String[] args) throws IOException   {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int cout = 0 ; 

        int[] a = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int i = 0, j = n-1;

        while (i <= j) {
            if (a[i] + a [j] <= x) {
            cout++;
            i++;
            j--;
        }else {
            cout++;
            j--;
        }

        }
System.out.println(cout);
        
    }
}

/*if (a[i] + a[j] <= x) {
    i++;
}
j--;
count++; */
