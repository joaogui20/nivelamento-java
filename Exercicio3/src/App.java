import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();

    }
}
