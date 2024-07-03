import java.util.Scanner;

public class job13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre entier n : ");
        int n = scanner.nextInt();

        System.out.println("Les nombres pairs inférieurs ou égaux à " + n + " sont :");
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
        scanner.close();
    }
}
