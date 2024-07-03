import java.util.Scanner;

public class job12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre entier : ");
        int n = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("La factorielle de " + n + " est : " + factorial);
        
        scanner.close();
    }
}
