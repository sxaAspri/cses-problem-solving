package introductoryProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class two_sets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        int i = 1;
        int j = n;
            
        

        if ((n * (n+1)/2)% 2 != 0) {// que la sumatoria no sea impar
            System.out.println("NO");
            
        }else if (n %2 == 0 ) { // si n es par entonces se resuelve 
            System.out.println("YES");

            

            while (i < j) {

            set1.add(i);
            set1.add(j);
            set2.add(i + 1);
            set2.add(j - 1);

            i += 2;
            j -= 2;
}// para que no me imprima los corchetes al querer imprimir la lista   
System.out.println(set1.size());
for (int x : set1) {
    System.out.print(x + " ");
}
System.out.println();

System.out.println(set2.size());
for (int x : set2) {
    System.out.print(x + " ");
}
System.out.println();
        } else {
            System.out.println("YES");
    
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
System.out.println(set1.size());
for (int x : set1) {
    System.out.print(x + " ");
}
System.out.println();

System.out.println(set2.size());
for (int x : set2) {
    System.out.print(x + " ");
}
System.out.println();
        }



    }
    
    
}
