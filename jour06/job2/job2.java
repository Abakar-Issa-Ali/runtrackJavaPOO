import java.util.Scanner;

public class job2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer votre prénom : ");
        String prenom = scanner.nextLine();

        System.out.println("Bonjour " + prenom + " !");
        
        scanner.close();
    }
}
