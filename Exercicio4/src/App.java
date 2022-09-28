import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int func, horas;
        double salario, valor;

        func = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        salario = horas * valor;

        System.out.println("NUMBER " + func + "\nSALARY = U$ " + salario);

        sc.close();

    }
}
