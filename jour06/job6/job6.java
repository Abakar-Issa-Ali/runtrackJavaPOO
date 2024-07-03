import java.util.Scanner;

public class job6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer le premier nombre : ");
        int nombre1 = scanner.nextInt();

        System.out.println("Veuillez entrer le deuxième nombre : ");
        int nombre2 = scanner.nextInt();

        System.out.println("Veuillez entrer le troisième nombre : ");
        int nombre3 = scanner.nextInt();

        int max = Math.max(nombre1, Math.max(nombre2, nombre3));
        System.out.println("Le maximum des trois nombres est : " + max);
        
        scanner.close();
    }
}
