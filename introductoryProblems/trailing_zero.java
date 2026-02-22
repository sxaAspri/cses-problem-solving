package introductoryProblems;
import java.util.Scanner;
public class trailing_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // Usamos long para el input porque n puede ser 10^9
        long ceros = 0;

        // Mientras n dividido por la potencia de 5 sea > 0
        for (long i = 5; n / i >= 1; i *= 5) {
            ceros += n / i;
            }

        System.out.println(ceros);

    }
    }

