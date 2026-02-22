package introductoryProblems;

import java.io.*;
import java.util.*;

public class two_setsbr {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        int i = 1;
        int j = n;

        // si la suma total es impar, no se puede
        if ((long) n * (n + 1) / 2 % 2 != 0) {
            sb.append("NO\n");
        } 
        else if (n % 2 == 0) {
            sb.append("YES\n");

            while (i < j) {
                set1.add(i);
                set1.add(j);
                set2.add(i + 1);
                set2.add(j - 1);

                i += 2;
                j -= 2;
            }

            sb.append(set1.size()).append('\n');
            for (int x : set1) sb.append(x).append(' ');
            sb.append('\n');

            sb.append(set2.size()).append('\n');
            for (int x : set2) sb.append(x).append(' ');
            sb.append('\n');
        } 
        else {
            sb.append("YES\n");

            set1.add(1);
            set1.add(2);
            set2.add(3);

            i = 4;
            j = n;

            while (i < j) {
                set1.add(i);
                set1.add(j);
                set2.add(i + 1);
                set2.add(j - 1);

                i += 2;
                j -= 2;
            }

            sb.append(set1.size()).append('\n');
            for (int x : set1) sb.append(x).append(' ');
            sb.append('\n');

            sb.append(set2.size()).append('\n');
            for (int x : set2) sb.append(x).append(' ');
            sb.append('\n');
        }

        System.out.print(sb.toString());
    }
}