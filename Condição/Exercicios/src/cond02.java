import java.util.Scanner;

public class cond02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        sc.close();
    }
}
