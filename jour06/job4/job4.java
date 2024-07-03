import java.util.Scanner;

public class job4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom : ");
        String nom = scanner.nextLine();

        System.out.println("Bienvenue " + nom + " !");
        
        scanner.close();
    }
}
