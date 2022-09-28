import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, area, pi = 3.14;

        R = sc.nextDouble();

        area = pi * R * R;

        System.out.println("A=" + area);

        sc.close();

    }
}
