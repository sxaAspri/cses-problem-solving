package introductoryProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tokenizer {
    public static void main(String[] args)throws IOException  {
        // leer rápido
BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
);

// convertir
int n = Integer.parseInt(br.readLine());

// tokenizar
StringTokenizer st = new StringTokenizer(br.readLine());
int x = Integer.parseInt(st.nextToken());
    }
}
