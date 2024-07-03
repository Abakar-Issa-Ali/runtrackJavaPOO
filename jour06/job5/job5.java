import java.util.Scanner;

public class job5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre : ");
        int nombre = scanner.nextInt();

        int carre = nombre * nombre;
        System.out.println("Le carre de " + nombre + " est : " + carre);
        
        scanner.close();
    }
}
