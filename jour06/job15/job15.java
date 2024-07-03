import java.util.Scanner;

public class job15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();
        int nombreInverse = 0;

        while (nombre != 0) {
            int chiffre = nombre % 10;
            nombreInverse = nombreInverse * 10 + chiffre;
            nombre /= 10;
        }

        System.out.println("Le nombre inversé est : " + nombreInverse);
        
        scanner.close();
    }
}
