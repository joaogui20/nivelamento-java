import java.util.Locale;
import java.util.Scanner;

public class uri1038 {
    public static void main(String[] args) {
        System.out.println("---------- CARDÁPIO ----------");
        System.out.println("1   Cachorro Quente    R$ 4.00");
        System.out.println("2   X-Salada           R$ 4.50");
        System.out.println("3   X-Bacon            R$ 5.00");
        System.out.println("4   Torrada simples    R$ 2.00");
        System.out.println("5   Refrigerante       R$ 1.50");
        System.out.println("------------------------------");

        Scanner sc = new Scanner(System.in);
        
        int codigo = sc.nextInt(); 
        int item = sc.nextInt();
        
        double total;
        if (codigo == 1) {
            total = item * 4.0;
        }
        else if (codigo == 2) {
            total = item * 4.5;
        }
        else if (codigo == 3) {
            total = item * 5.0;
        }
        else if (codigo == 4) {
            total = item * 2.0;
        }
        else {
            total = item * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
